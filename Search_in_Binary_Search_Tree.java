
public class Search_in_Binary_Search_Tree {

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
		boolean found1 = search(a,22);
		boolean found2 = search(a,5);
		System.out.println(found1);
		System.out.println(found2);
	}

	private static boolean search(Node root, int key) {
		// TODO Auto-generated method stub
		if(root == null) {
			return false;
		}
		else {
			if(key == root.data) {
				return true;
			}
			else if(key < root.data ) {
				return search(root.left,key);
			}
			else if(key > root.data) {
				return search(root.right,key);
			}
			else {
				return false;
			}
		}
	}

}

