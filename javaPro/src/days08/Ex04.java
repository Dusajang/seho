package days08;

/**
 * @author dkrkdfla
 * @date 2024. 7. 10. - 오후 4:13:29
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//[정보처리 기사 실기]
		int money = 125760;
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
	//	int count = 0;
	//	int share, reminder;
		// 5만원 : 2개		25760;
	//	count = share = money/50000;
	//	reminder = money % 50000;
	//	System.out.printf("5만원 : %d개\t\t %d\n", count,reminder);
	//	money = reminder;
		// 1만원 : 2개		5760
	//	count = share = money/10000;
	//	reminder = money % 10000;
	//	System.out.printf("1만원 : %d개\t\t %d\n", count,reminder);
		// 5천원 : 1개		760
		// 1천원 : 0개		760
		// 5백원 : 1개		260
		// 1백원 : 2개		60
		// 5십원 : 1개		10
		// 1십원 : 1개		0
		// 5원 : 0개			0
		// 1원 : 0개			0
		
		
		
		 //String [] sunit = { "5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원" };

		
		int count = 0;
		int share, reminder;
		//				/5			/2		/5		/2		/5		/2		/5 	/2	/5	/2
		int[] i = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		for (int j = 0; j < i.length; j++) {
			count = money/i[j];
			reminder = money % i[j];
			money = reminder;
			System.out.printf("%d원 : %d개\t %d\n", i[j], count,reminder); //System.out.printf("%d : %d개\t %d\n", i[j], count,reminder);
		}
		
		
		
	}//main

}//class






