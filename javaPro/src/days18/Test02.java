package days18;

import java.io.FileReader;

public class Test02 {

	public static void main(String[] args) {
		// 2. days17.Ex01.java 파일을 읽어서 알파벳 대문자, 소문자
		//, 숫자를 가변 배열에 저장하고 #으로 출력하는 코딩을 하세요.
		String fileName = ".\\src\\days17\\Ex01.java";
		
		int[][] counts = new int[3][];
		counts[0] = new int [26];  //대문자
		counts[1] = new int [26];  //소문자
		counts[2] = new int [10];  //숫자
		
		try (
				FileReader reader = new FileReader(fileName)
				){
			// -1이면 더 읽어올게 없다
			int code;
			while ((code = reader.read()) != -1) {
				if (Character.isUpperCase((char)code)) {
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}
