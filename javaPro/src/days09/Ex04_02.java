package days09;

public class Ex04_02 {

	public static void main(String[] args) {
		int n = 10;			//8진수 출력		012
		int share, reminder;
		
		String octal = "";
		
		while (n != 0) {
			share = n/8;
			reminder = n%8;
			//System.out.printf("%d", reminder);
			octal = reminder + octal;		//"12"
			n=share;
		}
		octal = "0"+octal;
		System.out.println(octal);
		
	}//main

}//class

/*
		int share, reminder;
		
		int[] octaArr = new int[32];
		
		int index = octaArr.length-1;
		while (n>8) {
			share = n/8;
			reminder = n%8;
			n=share;
			System.out.printf("%d", reminder);
		}

		for (int i = 0; i < octaArr.length; i++) {
			System.out.printf("%d", octaArr[i]);
			if (i%8==7) System.out.print(" ");
		}
 */