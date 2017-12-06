import java.util.LinkedList;
import java.util.Queue;

public class Level_BY_Level_Traversal_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(2);
		Node d = new Node(6);
		Node e = new Node(4);
		Node f = new Node(5);
		Node g = new Node(8);
		Node h = new Node(9);
		Node i = new Node(10);
		a.left = b;
		a.right = c;
		b.right = d;
		d.right = g;
		c.left = e;
		c.right = f;
		e.left = h;
		e.right = i;
		levelByLevelOrderTraversalBinaryTree(a);
	}

	private static void levelByLevelOrderTraversalBinaryTree(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		q1.add(root);
		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (!q1.isEmpty()) {
				root = q1.poll();
				System.out.print(root.data);
				if (root.left != null) {
					q2.add(root.left);
				}
				if (root.right != null) {
					q2.add(root.right);
				}
			}
			System.out.println();
			while (!q2.isEmpty()) {
				root = q2.poll();
				System.out.print(root.data);
				if (root.left != null) {
					q1.add(root.left);
				}
				if (root.right != null) {
					q1.add(root.right);
				}
			}
			System.out.println();
			
		}
	}

}
