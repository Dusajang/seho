package days010;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author dkrkdfla
 * @date 2024. 7. 12.오전 11:27:31
 * @subject		배열 단점 -> 컬렉션 클래스 JCF java collection framework
 * @content
 *
 */
public class Ex04 {

	static int index = 0;
	static char con ='y';
	static Scanner scanner = new Scanner(System.in);
	static int[] m = new int[2];
	static int selectedNumber;	// 선택된 메뉴 번호를 저장할 변수
	static String[] menus = {"추가", "수정", "삭제", "검색, ", "조회", "종료"};

	public static void main(String[] args) throws IOException {

		while (true) {
			dispMenus();
			selectMenus();
			processMenus();

		}//while


	}//main

	// [enum 열거형 선언]
	static final int ADD = 1;
	static final int EDIT = 2;

	private static void processMenus() throws IOException {
		switch (selectedNumber) {
		case ADD:		//추가
			add();
			break;
		case EDIT:		//수정
			break;
		case 3:		//삭제
			//삭제할 index = 2
			delete();
			break;
		case 4:		//검색
			search();
			break;
		case 5:		//조회 - 배열의 모든 요소를 출력
			list();
			break;
		case 6:		//종료
			exit();
			break;

		}//switch
		일시정지();
	}

	private static void search() {
		// TODO Auto-generated method stub
		
	}

	private static void delete() {
		System.out.println("[3. 삭제]");
		int deleteindex;

		String regex = String.format("[0-%d]", index-1);
		String inputData;
		do {
			System.out.println(">삭제할 index 입력");	
			inputData = scanner.next();

		} while (!inputData.matches(regex));
		deleteindex = Integer.parseInt(inputData);	

		for (int i = deleteindex-1; i < index; i++) {
			m[i-1] = m[i];
		}
		m[index-1] = 0;
		index--;


	}//delete

	private static void 일시정지() {
		System.out.print(">엔터를 누르면 계속");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n\n\n\n");

	}

	private static void list() {
		System.out.println("[5. 조회]");
		if (index==0) {
			System.out.println("\t 추가된요소가 없음");
			return;
		}//if

		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d] = %d\t", i, m[i]);
		}

	}

	private static void add() throws IOException {

		System.out.println("[1. 추가]");
		do {
			if (index == m.length) {
				//				System.out.println("\t풀방...");
				//				return;
				increaseArrayM();
			}

			System.out.printf(">정수 입력");
			int n = scanner.nextInt();
			m[index++] = n;

			System.out.print("\t 요소추가 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());


		} while (Character.toUpperCase(con) == 'Y');


	}

	private static void increaseArrayM() {
		if (index == m.length) {
			int [] temp = new int [m.length*2];
			//			for (int i = 0; i < m.length; i++) {
			//				temp[i] = m[i];
			//			}
			System.arraycopy(m, 0, temp, 0, temp.length);
			m=temp;
		}
	}

	private static void exit() {
		System.out.println("\n\n 프로그램을 종료");
		System.exit(-1);

	}

	private static void selectMenus() {
		String regex = "[1-6]";
		String inputData;
		do {
			System.out.println(">메뉴 선택");	//1~6
			inputData = scanner.next();

		} while (!inputData.matches(regex));
		selectedNumber = Integer.parseInt(inputData);	
	}


	private static void dispMenus() {		//메뉴 출력 함수
		System.out.println("\t\t\t[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("[%d]%s\t", i+1, menus[i]);
		}
		System.out.println();
	}

}//class









