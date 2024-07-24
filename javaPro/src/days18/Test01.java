package days18;

import java.util.Date;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*
		1.  년도 year를 입력받아서 
	    입력받은 년도의 1월~12월 까지의 마지막 날짜를 출력하는 코딩을 하세요. 
	    ( 조건 : Date 클래스 사용 )
	    ( 조건 : Scanner 클래스 사용 + try~with~resource문 사용)
	    
	    실행결과 예제)
	    2005년 
	    
		1월 : 31일
		2월 : 28일
		3월 : 31일
		4월 : 30일
		5월 : 31일
		6월 : 30일
		7월 : 31일
		8월 : 31일
		9월 : 30일
		10월 : 31일
		11월 : 30일
		12월 : 31일
		*/
		int year, month, day;
		
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		
	    
	    
	    getLastDay(year);
		
		
		


	}

	private static int getLastDay(int year) {
		Date d = new Date(year-1900);
		d.setMonth(d.getMonth()+1);
		d.setDate(d.getDate()-1);
		return d.getDate();
		
	}

}
