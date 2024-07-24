package days17;

/**
 * @author dkrkdfla
 * @date 2024. 7. 23.오후 12:14:32
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// [java.lang.Math 클래스]
		//Math. + 모든 멤버들 : static
		//클래스명.멤버명으로 사용 가능
		
		System.out.println(Math.random());
		System.out.println(Math.pow(2,3));
		System.out.println(Math.max(2,3));
		System.out.println(Math.min(2,3));
		System.out.println(Math.abs(-3));       // 절대값
		System.out.println(Math.abs(-3.99));
		
		System.out.println(Math.PI);
		System.out.println(Math.E);

		//암기**
		//ceil -> 올림 == 절상   double이 리턴타입   소수점 1번째
		System.out.println(Math.ceil(2.0));        // 2.0
		System.out.println(Math.ceil(2.178));    // 3.0
		System.out.println(Math.ceil(2.578));    // 3.0
		System.out.println(Math.ceil(2.978));    // 3.0
		
		// 반올림                   int
		System.out.println(Math.round(2.0));        // 2
		System.out.println(Math.round(2.178));    // 3
		System.out.println(Math.round(2.578));    // 3
		System.out.println(Math.round(2.978));    // 3
		 
		//내림 == 절삭          double
		System.out.println(Math.floor(2.0));        // 2.0
		System.out.println(Math.floor(2.178));    // 2.0
		System.out.println(Math.floor(2.578));    // 2.0
		System.out.println(Math.floor(2.978));    // 2.0
		
		

	}//main

}//class










