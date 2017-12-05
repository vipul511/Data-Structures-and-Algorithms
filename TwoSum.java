import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,11,15};
		int target = 9;
		int[] b = twoSum(a,target);
		for (int i = 0 ; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	private static int[] twoSum(int[] a, int target) {
		// TODO Auto-generated method stub
		int complement = 0;
		Map<Integer,Integer> seen = new HashMap<>();
		for(int i = 0 ; i< a.length; i++) {
			complement = target - a[i];
			if(seen.containsKey(complement)) {
				return new int[] {seen.get(complement),i };
			}
			seen.put(a[i],i );
		}
		return null;
	}

}
