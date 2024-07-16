package days09;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 11.오후 5:06:13
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;

		final int STUDENT_COUNT = 30;

		String[] names = new String[STUDENT_COUNT];
		int [] kors = new int [STUDENT_COUNT];
		int [] engs = new int [STUDENT_COUNT];
		int [] mats = new int [STUDENT_COUNT];
		int [] tots = new int [STUDENT_COUNT];
		int [] ranks = new int [STUDENT_COUNT];
		double[] avgs = new double [STUDENT_COUNT];

		Scanner scanner = new Scanner(System.in);
		int count =0;  //입력받은 학생 수

		char con = 'y';

		do {
			System.out.printf(">%d번 학생 이름, 국어, 영어, 수학, 입력", count+1);
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
			tot = kor+eng+mat;
			avg = (double)tot/3;
			rank = 1;
			
			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank;

			
			count++;
			//입력 계속?
			System.out.print(">학생 입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		System.out.printf("총 학생 수 : %d\n", count);
		
		




	}//main

}//class





