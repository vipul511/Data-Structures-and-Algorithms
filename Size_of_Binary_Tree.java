
public class Size_of_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(10);
		Node b = new Node(-5);
		Node c = new Node(-10);
		Node d = new Node(5);
		Node e = new Node(25);
		Node f = new Node(36);
		a.left = b;
		b.left = c;
		b.right = d;
		a.right = e;
		e.right = f;
		int size = size(a);
		System.out.print(Integer.toString(size));
	}

	private static int size(Node root) {
		// TODO Auto-generated method stub
		if(root == null) return 0;
		int leftsize  = size(root.left);
		int rightsize = size(root.right);
		return 1 + leftsize + rightsize;
	}

}
