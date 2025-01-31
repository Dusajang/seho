package days010;

public class Ex03 {

	public static void main(String[] args) {
		/*
		double result = pow(2,3);
		System.out.println(result);

		result = pow(2,-3);
		System.out.println(result);
		 */

		double result = recursivePow(2,3);
		System.out.println(result);

		result = recursivePow(2,-3);
		System.out.println(result);

		result = recursivePow(2,0);
		System.out.println(result);

	}//main

	//2^3
	//2*recursivePow(2,2)
	//2*2*recursivePow(2,1)
	//2*2*2*
	private static double recursivePow(int i, int j) {
		if(j<0) return 1/recursivePow(i, -j);
		else if (j>1) return i* recursivePow(i, j-1);
		else if(j==0) return 1;
		else return i;	// if(j==1)
	}

	private static double pow(int i, int j) {
		//2^3 = 2x2x2
		//2^-3 =1/2^3 =1/(2x2x2)
		double result = 1;
		int exp = Math.abs(j);
		for (int k = 0; k < exp; k++) {
			result *= i;
		}
		return j>0 ? result : 1/result;
	}

}//class
