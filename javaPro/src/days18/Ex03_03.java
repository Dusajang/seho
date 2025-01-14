package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author dkrkdfla
 * @date 2024. 7. 24.오후 12:26:23
 * @subject
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);  //2024-07-24
		//년
		int year =  ld.get(ChronoField.YEAR);
		year = ld.getYear();
		System.out.println(year);

		//월
		int month = ld.get(ChronoField.MONTH_OF_YEAR);
		month = ld.getMonthValue();
		System.out.println(month);

		//일
		//int day = ld.get(ChronoField.DAY_OF_MONTH);
		int day = ld.getDayOfMonth();

		// 요일
		int dof = ld.get(ChronoField.DAY_OF_WEEK);
		System.out.println(dof ); //  월(1) ~ 일(7)
		//                     Date   일(0) ~ 토(6)
		//                  Calendar  일(1) ~ 토(7)

		DayOfWeek edow  = ld.getDayOfWeek();
		System.out.println( edow ); // MONDAY
		System.out.println( edow.getValue() ); // 1


		LocalTime lt = LocalTime.now();
		//시
		int hour = lt.get(ChronoField.HOUR_OF_DAY);
		hour = lt.getHour();
		System.out.println(hour);

		//분
		//int min = lt.get(ChronoField.MINUTE_OF_HOUR);
		int min = lt.getMinute();
		System.out.println(min);

		//초
		int sec = lt.get(ChronoField.SECOND_OF_MINUTE);
		sec = lt.getSecond();
		System.out.println(sec);

		//밀리초
		int ms = lt.get(ChronoField.MILLI_OF_DAY);
		ms = lt.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(ms);
		
		//나노
		long ns = lt.get(ChronoField.NANO_OF_SECOND);
		ns = lt.getLong(ChronoField.NANO_OF_DAY);
		ns = lt.getNano();
		System.out.println(ns);

	}//main

}//class
