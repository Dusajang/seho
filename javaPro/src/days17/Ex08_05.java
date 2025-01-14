package days17;

import java.util.Date;

/**
 * @author dkrkdfla
 * @date 2024. 7. 23.오후 5:07:00
 * @subject
 * @content        .after()시간이 지났냐   .before()시간 전이냐    .equals() 시간이 같냐
 *
 */
public class Ex08_05 {

	public static void main(String[] args) {
		//설문조사
		//시작일 24.6.25   9:00:00
		//종료일 24.7.25   18:00:00
		
		// 1. 24.6.20    12:00:00    설문전이라 투표 불가
		// 2. 24.7.20    12:00:00    설문 진행 중
		// 2. 24.7.25    19:00:00    설문 종료, 투표 불가
		// 3. 24.8.20    12:00:00    설문 종료, 투표 불가
		
		Date start = new Date(2024-1900, 6-1, 25, 9, 0, 0);
		Date end = new Date(2024-1900, 7-1, 25, 18, 0, 0);
		Date vote = new Date(2024-1900, 8-1, 20, 12, 0, 0);
		
		//System.out.println(start.getTime());
		//System.out.println(end.getTime());
		
		votePossible(start.getTime(), end.getTime(), vote.getTime());
		

	}//main

	private static void votePossible(long time, long time2, long time3) {
		if (time > time3) {
			System.out.println("설문조사 불가. 설문조사 기간 전");
		}else if (time2 < time3) {
			System.out.println("설문조사 불가. 설문조사 기간 초과");
		}else {
			System.out.println("설문조사 가능. 진행 중");
		}
		
	}

	

}//class
