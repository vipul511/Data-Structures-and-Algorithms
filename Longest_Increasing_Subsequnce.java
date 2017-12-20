
public class Longest_Increasing_Subsequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,5, 7, -1, 3, 5, 6, 9 ,10}; // -1 3 5 6 9 10
		System.out.println(Integer.toString(LIS(a)));
	}

	private static int LIS(int[] a) {
		// TODO Auto-generated method stub
		int[] t = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			t[i]=1;
		}
		for(int i = 1; i< a.length; i++) {
			for(int j= 0; j < a.length; j++) {
				if(a[j]< a[i]) {
					if(t[j] + 1 > t[i]) {
						t[i]= t[j]+1;
					}
				}
			}
		}
		int maxlength = 0;
		for(int i = 0 ; i< a.length; i++) {
			if(t[i] > maxlength) {
				maxlength = t[i];
			}
		}
		return maxlength;
	}

}
