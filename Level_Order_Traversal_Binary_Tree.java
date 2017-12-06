import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(10);
		Node b = new Node(21);
		Node c = new Node(15);
		Node d = new Node(18);
		Node e = new Node(19);
		Node f = new Node(-6);
		Node g = new Node(17);
		Node h = new Node(0);
		Node i = new Node(12);
		a.left = b;
		a.right = e;
		b.right = c;
		c.left = d;
		c.left = d;
		e.left = f;
		e.right = h;
		f.right = g;
		h.right = i;
		levelOrderTraversalBinaryTree(a);
	}

	private static void levelOrderTraversalBinaryTree(Node root) {
		// TODO Auto-generated method stub
		if(root == null)return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			root = q.poll();
			System.out.println(root.data);
			if(root.left != null) {
				q.add(root.left);
			}
			if(root.right != null) {
				q.add(root.right);
			}
			
		}
	}

}
