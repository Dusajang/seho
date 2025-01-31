package days17;

/**
 * @author dkrkdfla
 * @date 2024. 7. 23.오후 12:21:37
 * @subject            boxing, unboxing
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//boxing, unboxing
		int i = 100;     //기본형 int
		// 기본형 -> 자동으로 래퍼클래스로 형변환
		//        오토(auto) 박싱
		Integer j = i;     // wrapper class Integer
		System.out.println(j);
		
		//래퍼클래스 -> 자동으로 기본형 형변환
		//        오토 언박싱
		int k = j;
		
		test(1);          //int -> integer -> Object
		test(true);
		test(3.14);
		test('a');
		//test('a', "aaa", 19, 1.23, true);
		

	}//main
	
	public static void test(Object o) {     //모든 변수를 받겠다
		
	}

}//class








