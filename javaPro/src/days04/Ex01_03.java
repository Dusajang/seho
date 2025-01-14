package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String name;
		byte age;
		char grade;

		// "홍길동,23,A"
		System.out.print("이름, 나이, 등급 입력하세요 ?");
		String data = bufferedReader.readLine();
		// "홍길동,23,A"
		// name = "홍길동"
		// age = "23" -> 23 String int Integer.parseInt()
		// grade = "A" -> 'A' charAt(0)

		String regex = "\\s*,\\s*";
		String[] datas = data.split(regex);

		// 2.
		name = datas[0];
		age = Byte.parseByte(datas[1]); // " 23 "
		grade = datas[2].charAt(0);

		/*
		 * 1. name = datas[0].trim(); age = Byte.parseByte( datas[1].trim()); //
		 * "    23 " grade = datas[2].trim().charAt(0);
		 */

		System.out.printf("이름=\"%s\", 나이=%d, 등급=\'%c\'", name, age, grade);

	}// main

}// class
