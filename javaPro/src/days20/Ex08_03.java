package days20;

public class Ex08_03 {

	public static void main(String[] args) {
		//[제네릭의 제한]
		/*
		 * 
		 */

	}//main

}//class


class Box2<T>{
	//Cannot make a static reference to the non-static type T
	// 1) 제한 - 제네릭클래스에는 클래스 변수를 선언 X
	//static T item2;
	
	//Cannot make a static reference to the non-static type T
	// 2) 제한 - 클래스 메서드 T타입 사용 X
//	static int compare(T a, T b) {
//		return 0;
//	}
	
	
	
	
}



