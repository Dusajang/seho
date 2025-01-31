package days08_Review;

import java.util.Calendar;
import java.util.Scanner;

public class Home_Review01_02 {

	public static void main(String[] args) {
		//1. 주민등록 번호를 입력받아서 만 나이를 계산하는 메서드 선언
		//960501-1234567
		System.out.println("주민번호 13자리를 입력 ('-'포함)");
		Scanner scanner = new Scanner(System.in);
		String rrn = scanner.nextLine();
		
		int bYear = Integer.parseInt( (rrn.substring(0, 2)) );
		int bMonth = Integer.parseInt( (rrn.substring(2, 4)) );
		int bDate = Integer.parseInt( (rrn.substring(4, 6)) );
		int Gender = Integer.parseInt( (rrn.substring(7, 8)) );
		
		int birthYear =getBirthYear(rrn);
		int yearAge = getYearAge(rrn);
		int americanAge = getAmericanAge(rrn);

		
		System.out.printf("출생년도 : %d\n", birthYear);
		System.out.printf("한국식 나이 : %d\n", yearAge);
		System.out.printf("만 나이 : %d\n", americanAge);
	}

	private static int getAmericanAge(String rrn) {
		int bMonth = Integer.parseInt( (rrn.substring(2, 4)) );
		int bDate = Integer.parseInt( (rrn.substring(4, 6)) );
		Calendar cal = Calendar.getInstance();
		int thisMonth = cal.get(Calendar.MONTH);
		int thisDate = cal.get(Calendar.DATE);
		int americanAge;
		
		if (bMonth < thisMonth || bMonth == thisMonth && bDate < thisDate) {
			americanAge = getYearAge(rrn);
		}else {americanAge = getYearAge(rrn)-1;}
		return americanAge;
	}

	private static int getYearAge(String rrn) {
		int bYear = Integer.parseInt( (rrn.substring(0, 2)) );
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
		int yearAge = thisYear - bYear;
		return yearAge;
	}

	private static int getBirthYear(String rrn) {
		int bYear = Integer.parseInt( (rrn.substring(0, 2)) );
		int Gender = Integer.parseInt( (rrn.substring(7, 8)) );
		
		if (Gender == 1 || Gender == 2 || Gender ==5  || Gender ==6 ) {
			bYear = 1900+bYear;
		}else if (Gender == 3 || Gender == 4 || Gender == 7 || Gender == 8) {
			bYear = 2000+bYear;
		}else {bYear = 1800+bYear;}
		return bYear;
	
	
	}//main

}//class
