package days06;

import java.util.Iterator;

public class Ex06_02 {

	public static void main(String[] args) {
		// 구구단 가로 (2단~9단)
		/*
		for (int i = 2; i <= 9; i++) {
			//System.out.printf("[%d단]", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d = %d\t", i, j, i*j);
			}//for j
			System.out.println();
		}//for i
		*/
		
		// 구구단 세로 (2단~9단)
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
		
		
	}//main

}//class
