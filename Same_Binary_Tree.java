
public class Same_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a1 = new Node(10);
		Node b1 = new Node(-5);
		Node c1 = new Node(-10);
		Node d1 = new Node(5);
		Node e1 = new Node(25);
		Node f1 = new Node(36);
		a1.left = b1;
		b1.left = c1;
		b1.right = d1;
		a1.right = e1;
		e1.right = f1;
		Node a2 = new Node(10);
		Node b2 = new Node(-5);
		Node c2 = new Node(-10);
		Node d2 = new Node(5);
		Node e2 = new Node(25);
		Node f2= new Node(36);
		a2.left = b2;
		b2.left = c2;
		b2.right = d2;
		a2.right = e2;
		e2.right = f2;
		boolean found1 = same(a1,a2);
		System.out.println(found1);

	}

	private static boolean same(Node root1, Node root2) {
		// TODO Auto-generated method stub
		if(root1== null && root2== null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		return root1.data == root2.data && same(root1.left,root2.left) && same(root1.right, root2.right);
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
