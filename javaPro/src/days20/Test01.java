package days20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*
		2. 로또 게임 횟수를 입력받아서 게임 횟수 만큼 로또 번호를 출력하는 전체 코딩을 하세요.
		  ( 조건 : 컬렉션 클래스 선택 후 사용 )
		  ( 조건 : 각 로또번호가 오름차순 정렬 후 출력 )
		    
		[출력형식]  
		1게임 : [09][14][18][27][34][36]
		2게임 : [12][18][29][36][39][42]
		3게임 : [09][14][20][24][27][35]
		4게임 : [06][24][29][32][39][42]
		5게임 : [02][11][23][42][44][45]  
		*/

		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		gameNumber = scanner.nextInt();  // 3

		LinkedHashSet lotto = null;
		ArrayList  lottos = new ArrayList();
		
		for (int i = 1; i <= gameNumber; i++) {
			lotto = new LinkedHashSet();         
			fillLotto(lotto);                    
			lottos.add(lotto);
		}
		
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			lotto = (LinkedHashSet) ir.next();
			dispLotto(lotto, gameNumber);
		}

	}//main
	private static void fillLotto(LinkedHashSet lotto) {
		Random rnd = new Random();
		int n ;
		while( lotto.size() < 6   ) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while

	}

	private static void dispLotto(LinkedHashSet lotto, int gameNumber) {
		Iterator ir = lotto.iterator();
		for (int i = 1; i <= gameNumber; i++) {
			System.out.printf("%d게임 : ", i);
			while (ir.hasNext()) {
				int num = (int) ir.next();
				System.out.printf("[%d]", num);
			}
			System.out.println();
		}
		System.out.println();

	}
	
}//class
