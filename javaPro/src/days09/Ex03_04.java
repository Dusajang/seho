package days09;

/**
 * @author 
 * @date
 * @content
 * @subject
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		//[문제]
		//거듭제곱 == 누승 == 멱 == pow
		//2^3 == 밑수를 지수만큼 반복해서 곱하는 것.
		//2^3 == 2*2*2
		
		double result = pow(2,3);
		//double result = pow(2,-3);
		System.out.println(result);
		

	}//main
	
	//재귀함수
	private static void recursivePow() {
		
		
	}
	//일반함수
	private static double pow(int i, int j) {
		//i=밑수, j=지수
		double result = 1;
		int exp = j<0 ? -j : j;
		for (int k = 0; k < exp; k++) {
			result *= i;
		}
		return j>0 ? result : 1/result;
	}

}//class
