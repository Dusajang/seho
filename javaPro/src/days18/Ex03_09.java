package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Ex03_09 {

	public static void main(String[] args) {
		// Period = 날짜 - 날짜
		// Duration = 시간 - 시간
		// 예) 수료일 - 오늘 = 날짜 간격?
		
		
		LocalDate ed = LocalDate.of(2024, 12, 14);
		ed = ed.plusDays(1);
		LocalDate td = LocalDate.now();
		
		Period p = Period.between(td, ed);
		System.out.println(p); // P4M21D
		System.out.println(p.getYears());      //0
		System.out.println(p.getMonths());   //4
		System.out.println(p.getDays());      //21
		
		// 18:00:00 퇴근시간까지의 남은 시간 파악
		LocalTime et = LocalTime.of(18, 0);
		System.out.println(et);
		LocalTime tt = LocalTime.now();
		System.out.println(tt);
		
		Duration d = Duration.between(tt, et);
		System.out.println(d);
		System.out.println(d.getNano());
		System.out.println(d.getSeconds());
		System.out.println(d.getSeconds()/60);
		System.out.println(d.getSeconds()/60/60);

	}

}









