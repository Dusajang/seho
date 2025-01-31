package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author dkrkdfla
 * @date 2024. 7. 24.오후 12:47:06
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		//String 의 특징 불변
		String a = "xyz";
		String b =  a.replace('y','와');
		
		
		//java.time 핵심클래스 불변
		LocalDate ld = LocalDate.now();
		System.out.println(ld); //2024-07-24
		
		ld = ld.withYear(2020);     // 받아서 바꿔야한다.
		System.out.println(ld);
		
		ld = ld.with(ChronoField.YEAR, 2024);
		System.out.println(ld);
		
		//월 12 수정
		ld = ld.withMonth(5);
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 12);
		System.out.println(ld);
		
		//5달 빼기                 minusXXX(), plusXXX(), plus()
		ld = ld.minusMonths(5);
		System.out.println(ld);
		ld = ld.plusMonths(5);
		System.out.println(ld);
		
		//truncatedTo(절삭할 단위)   절삭하다. 끝을 잘라내다.
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		// 시간보다 작은 단위를 모두 절삭.
		lt = lt.truncatedTo(ChronoUnit.HOURS);
		System.out.println(lt);
		
		//2024-07-24T14:16:25.372798100
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);

	}//main

}//class







