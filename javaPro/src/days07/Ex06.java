package days07;

import com.util.Draw2D;

/**
 * @author dkrkdfla
 * @date 2024. 7. 9. - 오후 3:32:11
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 메서드(함수)==method, function
		 * 1. 정의 : 프로그래밍에서 "반복되는 명령어들을" 찾아서 별도로 묶어서
		 * 필요할 때 마다 재사용하도록 만든 것.
		 * 2. 프로그램의 구조화 - 유지,보수 등 관리가 용이
		 * 3.함수가 기본이 되는 프로그래밍 기법 - 구조적 프로그래밍
		 *    객체가 기본이 되는 프로그래밍 기법 - 객체 지향적 프로그래밍(OOP)
		 * 4. 메서드(함수)선언 형식
		 *    [접]  [기]  리턴자료형 함수명([매개변수....]){
		 *    //실행문
		 *    //실행문
		 *    //실행문
		 *    :
		 *    [return리턴값;]
		 *    }
		 */

		//메서드 호출 부분
		Draw2D.drawLine(30);
		System.out.println("부서명 : 사원명");
		Draw2D.drawLine('^', 50);
		System.out.println("영업부 : 이시훈");
		System.out.println("생산부 : 송세호");
		System.out.println("총무부 : 김준석");
		System.out.println("자재부 : 김재민");
		Draw2D.drawLine();


	}//main

	//overloading 오버로드 == 중복함수
	//drawLine() 메서드 선언 부분



}//class
