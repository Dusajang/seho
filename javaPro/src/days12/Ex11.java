package days12;

/**
 * @author dkrkdfla
 * @date 2024. 7. 16.오후 5:17:40
 * @subject
 * @content
 *
 */
public class Ex11 {
	
	public String name;

	public static void main(String[] args) {
		// 기본형 or 참조형 메서드( 매개변수 )
		//								ㄴ 기본형 매개변수
		//								ㄴ 참조형 매개변수
		
		int [] m = new int[3];
		System.out.println(m.length);
		
		Ex11 ex = new Ex11();
		
		//ex.name = "홍길동";       //객체명. 필드명
		m = ex.increaseArray(m);     //객체명.메서드
		System.out.println(m.length);
		
		
		

	}//main

	public int[] increaseArray(int[] m) {	//참조형 매개변수
		
		int [] temp = new int[m.length+3];
		
		return temp;
	}

}//class





