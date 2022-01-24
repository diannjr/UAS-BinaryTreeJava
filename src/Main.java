/**
 *
 * @author DIAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object of BinaryTree
        BinaryTree tree = new BinaryTree();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);
    }
}