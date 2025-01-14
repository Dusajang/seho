package days20;

import java.util.ArrayList;

/**
 * @author dkrkdfla
 * @date 2024. 7. 26.오후 2:34:04
 * @subject   제네릭
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * [제네릭(Generics)]
		 * 1. jdk 1.5 - 가장큰 변화는 제네릭
		 *    jdk 1.8 - 가장큰 변화는 람다식
		 * 2. 제네릭이란?
		 *    댜양한 타입의 객체를 다루는 메서드,
		 *    컬렉션 클래스에서 컴파일 시에 타입을 체크해주는 기능.
		 * 3. 왜? 객체의 타입을 컴파일 시에 체크하는 이유?
		 *   1) 객체의 타입 안정성을 높이기 위해
		 *   2) 형변환의 번거로움을 줄이기 위해
		 *    ㄴ제네릭의 장점
		 */

		/*
		ArrayList list = new ArrayList();
		list.add(100); // int
		list.add(3.14); // double
		list.add(true); // boolean
		list.add('a'); // char
		list.add("name"); // String
		list.add(new Person()); // 

		int i = (int) list.get(0);
		double d =  (double) list.get(1);
		boolean b = (boolean) list.get(2);
		Person p = (Person) list.get(5);
		 */

		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("관리자");

		// list.add(100);    list는 String 타입만 받기에 int를 넣으면 오류가 난다.

		String name = list.get(0);


	}//main

}//class











