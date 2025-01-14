package days09;

import java.util.Calendar;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//3. 주민등록 번호를 입력받아서 만 나이를 계산하는 메서드만 선언하세요.
		System.out.println("주민번호 입력 ('-'포함)");
		Scanner scanner = new Scanner(System.in);
		String rrn = scanner.nextLine();
		
		int bYear = Integer.parseInt( rrn.substring(0, 2) );
		int bMonth = Integer.parseInt( rrn.substring(2, 4) );
		int bDate = Integer.parseInt( rrn.substring(4, 6) );
		int gender = Integer.parseInt( rrn.substring(7, 8) );
		
		
		int 출생년도 = getBirthYear(rrn);
		int 연나이 = getYearAge(rrn);
		int 만나이 = getAmericanAge(rrn);
		
		

	}//main

	private static int getYearAge(String rrn) {
	Calendar cal = Calendar.getInstance();
	int thisYear = cal.get(Calendar.YEAR);
	int yearAge = thisYear - getBirthYear(rrn);
		return yearAge;
		
	}

	private static int getBirthYear(String rrn) {
		int bYear = Integer.parseInt( rrn.substring(0, 2) );
		int gender = Integer.parseInt( rrn.substring(7, 8) );
		
		if (gender == 1 || gender == 2 ||gender == 5 ||gender == 6) {
			bYear = bYear +1900;
		}else if (gender == 3 || gender == 4 ||gender == 7 ||gender == 8) {
			bYear = bYear +2000;
		} else {bYear = bYear +1800;}
		return 0;
	}

	private static int getAmericanAge(String rrn) {
		int bMonth = Integer.parseInt( rrn.substring(2, 4) );
		int bDate = Integer.parseInt( rrn.substring(4, 6) );
		Calendar cal = Calendar.getInstance();
		int thisMonth = cal.get(Calendar.MONTH);
		int thisDate = cal.get(Calendar.DATE);
		
		int AmericanAge;
		if (bMonth < thisMonth ||(bMonth == thisMonth && bDate < thisDate) ) {
			AmericanAge = getYearAge(rrn);
		} else {
			AmericanAge = getYearAge(rrn)-1;
		}
		return AmericanAge;
		}

}//class
