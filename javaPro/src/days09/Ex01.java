package days09;

import java.util.Scanner;

/**
 * 달력
 * 년도, 월 입력
 * 
 * @param args
 */

public class Ex01 {

	public static void main(String[] args) {
		int year, month;
		Scanner scanner = new Scanner(System.in);
		
		int[] ymArr = getInputYM(scanner);
		year = ymArr[0];
		month = ymArr[1];
		
		printCalender(year, month);
				
		
	}//main

	public static void printCalender(int year, int month) {
		//1) 년 월 1일은 무슨 요일? 월요일
		//2) 년 월 마지막 날짜 몇일? 31
		int dayOfWeek = getDayOfWeek(year,month,1);
		int lastDay = getLastDay(year, month);
		
		//
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		System.out.println("-".repeat(60));
		String strWeek = "일월화수목금토";
		for (int i = 0; i < strWeek.length(); i++) {
			System.out.printf("\t%c", strWeek.charAt(i));
		}
		System.out.println();//개행
		System.out.println("-".repeat(60));
		//공백찍는 for
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		//System.out.printf("\t%d" ,1);
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("\t%d" ,i);
			if ((dayOfWeek+i) % 7 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		System.out.println("-".repeat(60));
		
		
	}//printCalender

	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int[] months = {31,28,31,20,31,30,31,31,30,31,30,31};
		lastDay = months[month-1];
		if (Ex02.isLeapYear(year) && month==2) lastDay++;
		/*
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31;
			break;
		case 4: case 6: case 9: case 11: 
			lastDay = 30;
			break;
		case 2: 
			lastDay = Ex02.isLeapYear(year) ? 29 : 28;
			break;
		}
		*/
		return lastDay;
	}

	
	private static int getDayOfWeek(int year, int month, int day) {
		//2020  5  1
		int totalDays = getTotalDays(year, month, month);
		int DayOfWeek = totalDays % 7; //0 일요일, 6 토요일
		
		System.out.printf("%d.%d.%d [%d]일(%c요일)\n"
							, year, month, day, totalDays, "일월화수목금토".charAt(DayOfWeek));
		
		return DayOfWeek;
	}

	private static int getTotalDays(int year, int month, int day) {
		//1.1.1 ~ 2020.5.1
		// 365(366) x (2020-1) + 31+28(29)+31+30+1
		//year(2020) 이전 년도 까지의 총 날짜 수
		int totalDays = 0;
		for (int i = 0; i < year; i++) {
			totalDays += Ex02.isLeapYear(i) ? 366 : 365;
		}
		//5            1월                               12월
		//              0  1  2  3                       11
		int[] months = {31,28,31,20,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month-1; i++) {
			totalDays += months[i];
		}
		if (Ex02.isLeapYear(year) && month>=3) totalDays++;
		totalDays++;
		return totalDays;
	}

	public static int[] getInputYM(Scanner scanner) {
		int[] ymArr = new int[2];
		System.out.println("년도 월 입력?");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		ymArr[0] = year;
		ymArr[1] = month;
		return ymArr;
	}

}//class