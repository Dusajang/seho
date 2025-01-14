package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days12.Student;

/**
 * @author dkrkdfla
 * @date 2024. 7. 17.오전 10:03:33
 * @subject		3반 30명의 성적처리
 * @content		클래스 배열
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3;
		final int STUDENT_COUNT = 30;

		Student [][] students = new Student[CLASS_COUNT][STUDENT_COUNT];

		int[] counts = new int[CLASS_COUNT];
		char con = 'y';


		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner scanner = new Scanner(System.in);

		int cIdx; 
		do {
			System.out.printf(">반 입력");
			cIdx = scanner.nextInt()-1;

			System.out.printf(">%d반의 [%d]번 학생 이름, 국어, 영어, 수학, 입력", cIdx+1, counts[cIdx]+1);

			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor+eng+mat;
			avg = (double)tot/3;
			wrank = rank = 1;

			students[cIdx][counts[cIdx]] = new Student();

			students[cIdx][counts[cIdx]].name = name;
			students[cIdx][counts[cIdx]].kor = kor;
			students[cIdx][counts[cIdx]].eng = eng;
			students[cIdx][counts[cIdx]].mat = mat;
			students[cIdx][counts[cIdx]].tot = tot;
			students[cIdx][counts[cIdx]].rank = rank;
			students[cIdx][counts[cIdx]].wrank = wrank;
			students[cIdx][counts[cIdx]].avg = avg;



			counts[cIdx]++;
			System.out.print(">입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		//반 등수, 전교 등수 처리 start

		//반 등수, 전교 등수 처리 end

		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				//students[i][j].tot
				//students[i][j].rank
				//students[i][j].wrank


				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						if(students[i][j].tot < students[i2][j2].tot) 
						{
							students[i][j].wrank++;
							if(i==i2) students[i][j].rank++;
						}

					}
				}
			}
		}


		int 총학생수 = IntStream.of(counts).sum();
		System.out.printf("\t\t학생 정보 출력(%d명)\n", 총학생수);

		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명]\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("[%d]",j+1 );
				students[i][j].dispInfo();
			}



		}



	}//main


	private static String getName() {
		Random rnd = new Random();
		String[] lastNames = {"김", "이", "박", "최", "권", "홍"};
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];

		//이름 2문자
		char[] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1) + '가');
		}
		String firstName = String.valueOf(firstNames);

		name +=firstName;

		return name;
	}

	public static int getScore() {
		return (int)(Math.random()*101);
	}



}//class
