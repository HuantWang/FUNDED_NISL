package cdfg.ast.main;

import cdfg.ast.structure.MyASTNode;
import cdfg.ast.structure.MyMethodNode;
import org.eclipse.jdt.core.dom.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ASTGenerator {

	public List<MyMethodNode> methodNodeList = new ArrayList<MyMethodNode>();

	public ASTGenerator(File f) {
		// TODO Auto-generated constructor stub
		ParseFile(f);
	}

	public List<MyMethodNode> getMethodNodeList() {
		return methodNodeList;
	}

	// read file content into a string
	public String readFileToString(String filePath) throws IOException {
		StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));

		char[] buf = new char[10];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			// System.out.println(numRead);
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}

		reader.close();

		return fileData.toString();
	}

	// use ASTParse to parse string
	public void parse(String str) {
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setSource(str.toCharArray());
//		parser.setKind(ASTParser.K_COMPILATION_UNIT);

		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);

		// find the MethodDeclaration node, MethodNodeVisitor
		MethodNodeVisitor methodNodeVisitor = new MethodNodeVisitor();
		cu.accept(methodNodeVisitor);
		// traverse all child nodes, NodeVisitor
		for (MethodDeclaration m : methodNodeVisitor.getMethodDecs()) {
			MyMethodNode mNode = new MyMethodNode();
			mNode.methodNode = m;
			NodeVisitor nv = new NodeVisitor();
			m.accept(nv);
			List<ASTNode> astnodes = nv.getASTNodes();
			for (ASTNode node : astnodes) {
				MyASTNode myNode = new MyASTNode();
				myNode.astNode = node;
				myNode.lineNum = cu.getLineNumber(node.getStartPosition());
				// add to nodeList
				mNode.nodeList.add(myNode);
				// add to mapping
				// in case, I need to exclude root node
				if (node.equals(m)) {
					continue;
				}
//				int pHashcode = node.getParent().hashCode();
				String pHashcode = node.getParent().toString();
//				int hashcode = node.hashCode();
				String hashcode = node.toString();
//				int[] link = { pHashcode, hashcode };
				String[] link = { pHashcode, hashcode };
				mNode.mapping.add(link);
			}
			methodNodeList.add(mNode);
		}
		// System.out.print(ast);

	}

	// loop directory to get file list
	public void ParseFilesInDir() throws IOException {
		File dirs = new File(".");
		String dirPath = dirs.getCanonicalPath() + File.separator + "src" + File.separator;

		File root = new File(dirPath);
		// System.out.println(rootDir.listFiles());
		File[] files = root.listFiles();
		String filePath = null;

		for (File f : files) {
			filePath = f.getAbsolutePath();
			if (f.isFile()) {
				parse(readFileToString(filePath));
			}
		}
	}

	// loop directory to get file list
	public void ParseFile(File f) {
		String filePath = f.getAbsolutePath();
		if (f.isFile()) {
			try {
				parse(readFileToString(filePath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Not a File!");
		}
	}
}
