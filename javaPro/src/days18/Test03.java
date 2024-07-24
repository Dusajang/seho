package days18;

import java.util.Calendar;

public class Test03 {

	public static void main(String[] args) {
		// 3. 수료일(2024.12.14. 18:00:00)로 부터 오늘까지 남은 일수 계산을 하세요.. 
		
		Calendar today = Calendar.getInstance();
		Calendar lastday = Calendar.getInstance();
		
		today.set(2024, 7, 24, 9, 0, 0);
		lastday.set(2024, 12, 14, 18, 0, 0);
		
		dayCount(today, lastday);

	}

	private static void dayCount(Calendar today, Calendar lastday) {
		long todayms = today.getTimeInMillis();
		long lastdayms = lastday.getTimeInMillis();
		
		long timeGap =  lastdayms - todayms;
		
		long day=0, hour=0, min=0, sec=0, ms=0;
		//System.out.print(timeGap);
		
		day = timeGap / (1000*60*60*24);
		timeGap = timeGap%(1000*60*60*24);
		System.out.print(day + "day left");
		
//		hour = timeGap / (1000*60*60);
//		timeGap = timeGap%(1000*60*60);
//		System.out.print(hour + "hour ");
//		
//		min = timeGap / (1000*60);
//		timeGap = timeGap%(1000*60);
//		System.out.print(min + "min ");
//		
//		sec = timeGap / (1000);
//		ms = timeGap%(1000);
//		System.out.print(sec + "min ");
//		System.out.print(ms + "ms ");
		
		
	}

}
