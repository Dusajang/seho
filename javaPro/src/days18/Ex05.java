package days18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days12.Student;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		// 한 반 30명 학생 성적처리
		// ㄱ. 배열 String [] names = new String[30];
		// *** ㄴ. 클래스 배열 Student [] s = new student[30];
		// ㄷ. 클래스 배열X -> ArrayList 사용

		String name;
		int kor, eng, mat, tot, rank;
		double avg;

		final int STUDENT_COUNT = 30;

		ArrayList list = new ArrayList();             //ArrayList list 객체 생성

		Scanner scanner = new Scanner(System.in);

		char con = 'y';

		do {
			System.out.printf(">%d번 학생 이름, 국어, 영어, 수학, 입력", list.size()+1);
			name = getName();//scanner.next();
			kor = getScore();//scanner.nextInt();
			eng = getScore();//scanner.nextInt();
			mat = getScore();//scanner.nextInt();
			tot = kor+eng+mat;
			avg = (double)tot/3;
			rank = 1;

			/*
			Student s = new Student();	//*****
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = rank;
			 */
			Student s = new Student(name, kor, eng, mat, tot, rank, avg);     //Student 클래스로 s 객체 생성

			list.add(s);

			//입력 계속?
			System.out.print(">학생 입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		System.out.printf("총 학생수 : %d\n", list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);

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










