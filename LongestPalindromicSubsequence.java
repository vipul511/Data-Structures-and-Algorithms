
public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[] {"a","b","c","b","c"};
		int b = lps(a);
		System.out.println(b);
	}

	private static int lps(String[] a) {
		// TODO Auto-generated method stub
		int length = a.length;
		int[][] T = new int[length][length]; 
		for(int i= 0; i< length-1; i++) {
			T[i][i] = 1;
		}
		
		for(int l = 2 ; l <= length; l++) {
			for(int i=0; i < length  - l + 1 ; i++  ) {
				int j = i + l - 1;
				if(l ==2 && a[i] == a[j]) {
					T[i][j] = 2;
				}
				else if(a[i] == a[j]) {
					T[i][j] = T[i+1][j-1] + 2; 
				}
				else {
					T[i][j] = Math.max(T[i][j-1], T[i+1][j]);
				}
			}
		}
		return T[0][length-1];
	}

}
