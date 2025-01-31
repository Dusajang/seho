package days08;

public class Ex01_02 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		fillLotto(lotto);
		
		dispLotto(lotto);
		
	}//main
	
	
	private static void fillLotto(int[] lotto) {
		int lottoNumber;
		lotto[0] =(int) ((Math.random()*45)+1);
		System.out.println(lotto[0]);
		//[45][0][0][0][0][0]
		//
		
		int index = 1;
		
		while (index <=5) {
			lottoNumber = (int)(Math.random()*45)+1;
			System.out.println(lottoNumber);
			if( !isDuplicate(lotto, lottoNumber, index) ) 
				lotto[index++] = lottoNumber;
		}//while
		
	}

	private static boolean isDuplicate(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if(lotto[i] == lottoNumber) {
				return true;
			}
		}
		return false;
	}


	private static void dispLotto(int[] lotto) {
		for (int i = 0; i <lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);	
		}
		System.out.println();
		
	}
	
	
}//class


