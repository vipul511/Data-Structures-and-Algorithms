import java.util.ArrayList;
import java.util.List;

public class find_target_equal_to_Root_to_leaf_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(10);
		Node b = new Node(16);
		Node c = new Node(-3);
		Node d = new Node(5);
		Node e = new Node(6);
		Node f = new Node(11);
		a.left = b;
		b.right = c;
		d.left = e;
		a.right = d;
		d.right = f;
		int target = 26;
		List<Integer> lists = new ArrayList<>();
		boolean found = root_to_leaf(a,target, lists);
		
		System.out.print(found);
	}

	private static boolean root_to_leaf(Node root,int target, List<Integer> result) {
		if (root == null) return false;
		if(root.left == null && root.right == null) {
			if(root.data == target) {
				result.add(root.data);
				return true;
			} 
		}
		if(root_to_leaf(root.left, target - root.data,result)) {
			result.add(root.data);
			return true;
		}
		if(root_to_leaf(root.right, target - root.data,result)) {
			result.add(root.data);
			return true;
		}
		return false;
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
