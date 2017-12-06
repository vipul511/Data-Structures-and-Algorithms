
public class Check_if_Binary_Search_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(10);
		Node b = new Node(0);
		Node c = new Node(-1);
		Node d = new Node(21);
		Node e = new Node(25);
		Node f = new Node(16);
		Node g = new Node(32);
		a.left = b;
		a.right = e;
		b.left = c;
		b.right = d;
		e.left = f;
		e.right = g;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		boolean check = isBinarySearchTree(a,min,max);
		System.out.println(check);
	}

	private static boolean isBinarySearchTree(Node root, int min, int max) {
		// TODO Auto-generated method stub
		if(root == null)return false;
		
		if(root.data <= min && root.data > max) {
			return false;
		}

		return isBinarySearchTree(root.left, min,root.data) && isBinarySearchTree(root.right, root.data, max);
		
	}

}


