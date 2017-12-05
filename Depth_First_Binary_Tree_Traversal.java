
public class Depth_First_Binary_Tree_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(10);
		Node b = new Node(2);
		Node c = new Node(6);
		Node d = new Node(5);
		Node e = new Node(8);
		Node f = new Node(3);
		a.left = b;
		b.left = c;
		a.right = d;
		d.left = e;
		d.right = f;

		System.out.println("Preorder");
		binary_tree_preorder(a);
		
		System.out.println("Inorder");
		binary_tree_inorder(a);
		
		System.out.println("Postorder");
		binary_tree_postorder(a);
	}

	private static void binary_tree_postorder(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			binary_tree_postorder(root.left);
			binary_tree_postorder(root.right);
			System.out.println(root.data);
		}
	}

	private static void binary_tree_preorder(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			System.out.println(root.data);
			binary_tree_preorder(root.left);
			binary_tree_preorder(root.right);
		}
	}

	private static void binary_tree_inorder(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			binary_tree_inorder(root.left);
			System.out.println(root.data);
			binary_tree_inorder(root.right);
		}
	}

}

class Node{
	int data;
	Node left;
	Node right;
	public Node(int d) {
		this.data = d;
	}
}