package days07;

public class Ex06_03 {

	public static void main(String[] args) {
		// 
		int [] m = {1,2,3,4,5};
		int result = hap(m);
		System.out.println(result);
	}//main

	public static int hap(int[] m) {
		int result = 0;
		for (int i = 0;  i< m.length; i++) {
			result += m[i];		
			}
		return result;
	}

}//class
