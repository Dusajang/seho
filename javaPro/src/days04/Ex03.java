package days04;

public class Ex03 {

	public static void main(String[] args) {
		//대문자 -> 소문자 변환
		//소문자 -> 대문자 변환
		
		//'A' 65
		//'a' 97
		char lowerCase = 'x', upperCase;
		
		upperCase = (char) (lowerCase - 32);
		
		System.out.println(upperCase);

	}//main

}//class
