package days16;

/**
 * @author dkrkdfla
 * @date 2024. 7. 22.오후 12:07:28
 * @subject
 * @content
 *
 */
//클래스 선언할 때의 클래스
public class Ex03 {

	public static void main(String[] args) {

		// [java.lang 패키지 - 자바 가장 기본이 되는 클래스]
		// java.util 패키지 - 자주 사용되는 유용한 클래스
		// 1. [java.lang.Object 클래스]
		
		Item item1 = new Item(10);
		Item item2 = new Item(10);
		System.out.println(item1.hashCode());
		System.out.println(item2.hashCode());
		//  ㄱ. int hashCode()
		//       객체가 메모리상에 생성되면 생성된 객체의 주소값을 해싱기법을 사용해서 해시코드를 만들어서 반환하는 메서드이다.
		
		//   ㄴ. String toString()
		//        인스턴스에 대한 정보를 문자열로 반환하는 메서드
		//        오버라이딩
		//                        days16.Item@73a28541
		//                          패키지.클래스명@hashCode의 16진수 값
		System.out.println(item1.toString());
		
		
		//   ㄷ. getClass()
		//       객체 자신의 클래스 정보를 담고 있는 Class라는 인스턴스를 반환하는 메서드
		// Class<? extends Item> item1.getClass();
		// Class -> item1 이라고하는 객체의 클래스 정보를 갖고 있는 인스턴스
		Class cls =  item1.getClass();
		//                              days16.Item
		System.out.println( cls.getName() );  //풀네임은 뭔지
		//cls.getConstructors();  item1이 어떤 생성자를 갖는지
		//cls.getMethods();        item1이 어떤 메서드를 갖는지
		
		
		// ㄹ. clone()  객체의 복사본을 만들어서 반환
		
		
		
		

	}//main

}//class

class Item extends Object{

	@Override
	public String toString() {
		return "Item [value=" + value  + "]";
	}

	//필드
	int value;

	//생성자1
	Item(int value) {
		this.value = value;
	}
}//Item class







