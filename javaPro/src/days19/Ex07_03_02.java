package days19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25.오후 2:42:18
 * @subject
 * @content    로또번호 순서 정렬
 *              HAshSet -> LinkedHㅁshSet으로 치환
 *
 */
public class Ex07_03_02 {

	public static void main(String[] args) {
		// days11.Ex05.java 로또 게임
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		gameNumber = scanner.nextInt();  // 3

		LinkedHashSet lotto = null;
		ArrayList  lottos = new ArrayList();

		for (int i = 1; i <= gameNumber; i++) {
			lotto = new LinkedHashSet();         //처음 랜덤하게 생성된 숫자가 계속 While문을 돌면서 lottos에 저장됨
			fillLotto(lotto);                    //매번 새롭게 생성해주어야함으로 while문 안에 생성 메서드를 넣음
			lottos.add(lotto);
		}

		//
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			lotto = (LinkedHashSet) ir.next();
			dispLotto(lotto);
		}



	} // main

	private static void dispLotto(LinkedHashSet lotto) {

		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int num = (int) ir.next();
			System.out.printf("[%d]", num);
		}
		System.out.println();

	}

	private static void fillLotto(LinkedHashSet lotto) {
		Random rnd = new Random();
		int n ;
		while( lotto.size() < 6   ) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while

	}

} // class
