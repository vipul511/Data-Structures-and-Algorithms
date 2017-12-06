
public class Lowest_Common_Ancestor_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(3);
		Node b = new Node(6);
		Node c = new Node(8);
		Node d = new Node(2);
		Node e = new Node(11);
		Node f = new Node(13);
		Node g = new Node(9);
		Node h = new Node(5);
		Node i = new Node(7);
		a.left = b;
		a.right = c;
		b.right = d;
		b.right = e;
		e.left = g;
		e.right = h;
		c.right = f;
		f.left = i;
		Node lca = lca(a,e,c); // lca of 11 and 8 is 3
		System.out.println(lca.data);
		
	}

	private static Node lca(Node root, Node n1, Node n2) {
		// TODO Auto-generated method stub
		if(root == null) return null;
		if(root == n1 || root == n2) return root;
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		if(left != null && right != null) return root;
		if(left == null && right == null) return null;
		return left!= null ? left : right;
	}

}
