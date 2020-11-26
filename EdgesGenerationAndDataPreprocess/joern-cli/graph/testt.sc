/* 
每个函数生成的ast,cfg,pdg放在一个文件中
*/

import gremlin.scala.{Edge, GremlinScala}

import io.shiftleft.codepropertygraph.generated.EdgeTypes

import scala.collection.mutable

import java.io.{PrintWriter, File => JFile}

type pEdgeEntry = (AnyRef, AnyRef,Int)
type pVertexEntry = (AnyRef, String)
//type pdg = (Option[String], List[pEdgeEntry], List[pVertexEntry])

type aEdgeEntry = (AnyRef, AnyRef,Int)
type aVertexEntry = (AnyRef, String)
//type ast = (Option[String], List[aEdgeEntry], List[aVertexEntry])

type cEdgeEntry = (AnyRef, AnyRef,Int)
type cVertexEntry = (AnyRef, String)
//type cfg = (Option[String], List[cEdgeEntry], List[cVertexEntry])

//type r = (List[ast],List[cfg],List[pdg])
type r = (Option[String], List[aEdgeEntry], List[aVertexEntry], List[cEdgeEntry], List[cVertexEntry],List[pEdgeEntry], List[pVertexEntry])


private def pdgFromEdges(edges: GremlinScala[Edge]): (List[pEdgeEntry], List[pVertexEntry]) = {
  val filteredEdges = edges.filter(edge => edge.hasLabel(EdgeTypes.REACHING_DEF, EdgeTypes.CDG)).dedup.l

  val (edgeResult, vertexResult) =
    filteredEdges.foldLeft((mutable.Set.empty[pEdgeEntry], mutable.Set.empty[pVertexEntry])) {
      case ((edgeList, vertexList), edge) =>
        val edgeEntry = (edge.inVertex().id, edge.outVertex().id,2)
        val inVertexEntry = (edge.inVertex().id, edge.inVertex().property("CODE").orElse(""))
        val outVertexEntry = (edge.outVertex().id, edge.outVertex().property("CODE").orElse(""))

        (edgeList += edgeEntry, vertexList ++= Set(inVertexEntry, outVertexEntry))
    }

  (edgeResult.toList, vertexResult.toList)
}

private def astFromEdges(edges: GremlinScala[Edge]): (List[aEdgeEntry], List[aVertexEntry]) = {
  val filteredEdges = edges.filter(edge => edge.hasLabel(EdgeTypes.REACHING_DEF, EdgeTypes.AST)).dedup.l

  val (edgeResult, vertexResult) =
    filteredEdges.foldLeft((mutable.Set.empty[aEdgeEntry], mutable.Set.empty[aVertexEntry])) {
      case ((edgeList, vertexList), edge) =>
        val edgeEntry = (edge.inVertex().id, edge.outVertex().id,0)
        val inVertexEntry = (edge.inVertex().id, edge.inVertex().property("CODE").orElse(""))
        val outVertexEntry = (edge.outVertex().id, edge.outVertex().property("CODE").orElse(""))

        (edgeList += edgeEntry, vertexList ++= Set(inVertexEntry, outVertexEntry))
    }

  (edgeResult.toList, vertexResult.toList)
}

private def cfgFromEdges(edges: GremlinScala[Edge]): (List[cEdgeEntry], List[cVertexEntry]) = {
  val filteredEdges = edges.filter(edge => edge.hasLabel(EdgeTypes.REACHING_DEF, EdgeTypes.CFG)).dedup.l

  val (edgeResult, vertexResult) =
    filteredEdges.foldLeft((mutable.Set.empty[cEdgeEntry], mutable.Set.empty[cVertexEntry])) {
      case ((edgeList, vertexList), edge) =>
        val edgeEntry = (edge.inVertex().id, edge.outVertex().id,1)
        val inVertexEntry = (edge.inVertex().id, edge.inVertex().property("CODE").orElse(""))
        val outVertexEntry = (edge.outVertex().id, edge.outVertex().property("CODE").orElse(""))

        (edgeList += edgeEntry, vertexList ++= Set(inVertexEntry, outVertexEntry))
    }

  (edgeResult.toList, vertexResult.toList)
}

//type r = (Option[String], List[aEdgeEntry], List[aVertexEntry], List[cEdgeEntry], List[cVertexEntry],List[pEdgeEntry], List[pVertexEntry])


def result(methodRegex: String = ""): List[r] = {
  if (methodRegex.isEmpty) {
    val (aedgeEntries, avertexEntries) = astFromEdges(cpg.scalaGraph.E())
    val (cedgeEntries, cvertexEntries) = cfgFromEdges(cpg.scalaGraph.E())
    val (pedgeEntries, pvertexEntries) = pdgFromEdges(cpg.scalaGraph.E())
    List((None, aedgeEntries, avertexEntries, cedgeEntries, cvertexEntries, pedgeEntries, pvertexEntries))
  } else {
    cpg.method(methodRegex).l.map { method =>
      val methodFile = method.location.filename+"-"+method.name
      val (aedgeEntries, avertexEntries) = astFromEdges(method.asScala.out().flatMap(_.asScala.outE()))
      val (cedgeEntries, cvertexEntries) = cfgFromEdges(method.asScala.out().flatMap(_.asScala.outE()))
      val (pedgeEntries, pvertexEntries) = pdgFromEdges(method.asScala.out().flatMap(_.asScala.outE()))

      (Some(methodFile), aedgeEntries, avertexEntries, cedgeEntries, cvertexEntries, pedgeEntries, pvertexEntries)
    }
  }
}


@main def main()= {

  var item = 0
  val list = result(".*")
  println(list.length)


  for (item <- list){
        var filename=BigInt(100, scala.util.Random).toString(36)
	val writer = new PrintWriter(new JFile("raw_result//pm//good//"+filename+".txt"))
	//val writer = new PrintWriter(new JFile("raw_result//bad//"+filename+".txt"))
	writer.println(item)
        writer.close()
  }
  
}
