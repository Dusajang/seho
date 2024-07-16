package days010;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex01_02 {
	
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;

	static final int STUDENT_COUNT = 30;

	static String[] names = new String[STUDENT_COUNT];
	static int [] kors = new int [STUDENT_COUNT];
	static int [] engs = new int [STUDENT_COUNT];
	static int [] mats = new int [STUDENT_COUNT];
	static int [] tots = new int [STUDENT_COUNT];
	static int [] ranks = new int [STUDENT_COUNT];
	static double[] avgs = new double [STUDENT_COUNT];

	static Scanner scanner = new Scanner(System.in);
	static int count =0;  //입력받은 학생 수

	static char con = 'y';

	public static void main(String[] args) throws IOException {
	

		studentInfomationInput();
		
		studentInfomationOutput();


	}//main
	
	public static void processRank() {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if(tots[i]<tots[j]) ranks[i]++;
			}
		}
	}

	private static void studentInfomationOutput() {
		System.out.printf("총 학생수 : %d\n", count);

	      for (int i = 0; i < count; i++) {
	         System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
	               ,i+1, names[i], kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
	      }

	}

	private static void studentInfomationInput() throws IOException {
		
		do {
			System.out.printf(">%d번 학생 이름, 국어, 영어, 수학, 입력", count+1);
			name = getName();//scanner.next();
			kor = getScore();//scanner.nextInt();
			eng = getScore();//scanner.nextInt();
			mat = getScore();//scanner.nextInt();
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
		
		processRank();
		
	}

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
