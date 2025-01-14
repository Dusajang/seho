package days17;

import java.util.Calendar;

public class Ex09_02 {

	public static void main(String[] args) {
		// 개강일부터 현재까지 며칠, 몇 시간, 몇 분, 몇 초, 몇 밀리초....출력

		Calendar firstDay = Calendar.getInstance();
		Calendar nowDay = Calendar.getInstance();

		firstDay.set(2024, 7, 1, 9, 0, 0);
		nowDay.set(2024, 7, 24, 9, 0, 0);

		dayComp(firstDay, nowDay);
	}

	private static void dayComp(Calendar firstDay, Calendar nowDay) {
		// 밀리초 단위의 시간 가져오기
		long firstms = firstDay.getTimeInMillis();
		long nowms = nowDay.getTimeInMillis();

		System.out.println("firstms: " + firstms);
		System.out.println("nowms: " + nowms);

		long timeGap = Math.abs(nowms - firstms);

		long sec = 0, min = 0, hour = 0, day = 0;

		day = (timeGap / (1000 * 60 * 60 * 24));
		timeGap = timeGap % (1000 * 60 * 60 * 24);
		System.out.print(day + " day ");

		hour = (timeGap / (1000 * 60 * 60));
		timeGap = timeGap % (1000 * 60 * 60);
		System.out.print(hour + " hour ");

		min = (timeGap / (1000 * 60));
		timeGap = timeGap % (1000 * 60);
		System.out.print(min + " min ");

		sec = (timeGap / (1000));
		long msec = timeGap % (1000);
		System.out.print(sec + " sec " + msec + " msec");
	}
}