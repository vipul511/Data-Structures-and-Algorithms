
public class Height_of_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(10);
		Node b = new Node(5);
		Node c = new Node(6);
		Node d = new Node(8);
		Node e = new Node(7);
		Node f = new Node(4);
		a.left = b;
		a.right = c;
		c.left = d;
		c.right = e;
		e.right = f;
		int size = height(a);
		System.out.print(Integer.toString(size));
	}

	private static int height(Node root) {
		// TODO Auto-generated method stub
		if(root == null) return 0;
		int  leftheight = height(root.left);
		int rightheight = height(root.right);
		return Math.max(leftheight,rightheight) + 1;
	}

}
