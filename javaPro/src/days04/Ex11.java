package days04;

/**
 * @author dkrkdfla
 * @date 2024. 7. 4. - 오후 4:11:58
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		//continue 문
		//[for문] 행이 1줄일 때, {}생략하고 옆에 붙여서 코딩 가능
		
		/*
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			System.out.printf( "%d+", i );
			sum += i;
		}//for
		
		System.out.printf("=%d", sum);
		*/
		
		/*
		
		//1.
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if (i==5) continue;
			System.out.printf( "%d+", i );
			sum += i;
		}//for
		
		System.out.printf("=%d", sum);
		*/
		
		//[while문]
		/*
		//2.
		int i =1;
		int sum = 0;
		while (i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}//while
		
		System.out.printf("=%d", sum);
		*/
		
		
		
		
		
		//3.
		int i =0, sum = 0;
		while (++i <= 10) {
			if(i==5) continue;
			System.out.printf("%d+", i);
			sum += i;
		}//while
		
		System.out.printf("=%d", sum);
		
		
	}//main

	
}//class
