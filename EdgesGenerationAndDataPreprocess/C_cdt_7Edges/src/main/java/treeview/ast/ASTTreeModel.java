package treeview.ast;

import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTNodeLocation;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompoundStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTName;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import treeview.AbstractTreeTableModel;
import treeview.TreeTableModel;

public class ASTTreeModel extends AbstractTreeTableModel
        implements TreeTableModel
{
    protected static String[] cNames = { "Node", "Name", "Offset/Position" };

    protected static Class[] cTypes = { TreeTableModel.class, String.class, String.class, String.class };

    public ASTTreeModel(IASTNode root)
    {
        super(new TASTNode(root));
    }

    public int getChildCount( Object node )
    {
        Object[] children = getChildren((IASTNode) node);
        return children == null ? 0 : children.length;
    }

    public Object getChild( Object node , int i ) {
        return getChildren((IASTNode) node)[i];
    }

    public boolean isLeaf( Object node )
    {
        IASTNode astnode = (IASTNode) node;
        IASTNode[] children = getChildren(astnode);
        return (children == null) || (children.length == 0);
    }

    protected IASTNode[] getChildren( IASTNode node ) {
        return node.getChildren();
    }

    public int getColumnCount()
    {
        return cNames.length;
    }

    public String getColumnName( int column ) {
        return cNames[column];
    }

    public Class getColumnClass( int column ) {
        return cTypes[column];
    }

    public Object getValueAt( Object node , int column ) {
        TASTNode noderef = (TASTNode) node;
        
        try {
            switch (column) {
            case 0:
                return "nada";
            case 1:
                IASTNode original = noderef.getOriginalNode();

                if ((original instanceof CPPASTSimpleDeclaration)) {
                    return original.getRawSignature();
                }

                if (((original instanceof CPPASTNamedTypeSpecifier)) ||
                        ((original instanceof CPPASTName)))
                {
                    return original.toString();
                }

                if ((original instanceof CPPASTCompoundStatement)) {
                    return "{";
                }

                return "[[" + original.getRawSignature() + "]]";
            case 2:
                IASTNodeLocation[] nodeLocations = noderef.getNodeLocations();
                StringBuilder sb = new StringBuilder();
                for (IASTNodeLocation iastNodeLocation : nodeLocations) {
                    sb.append(iastNodeLocation.getNodeOffset() + ":" + iastNodeLocation.getNodeLength());
                    sb.append(",");
                }

                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            }
        } catch (SecurityException localSecurityException) {}
        return null;
    }
}
