package days12;

/**
 * @author dkrkdfla
 * @date 2024. 7. 16.오후 3:44:20
 * @subject		객체(클래스) 배열
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		//points 배열명
		
		Point [] points = new Point[5000];
		
		//클래스 배열을 사용할 때 주의할 점
		points[0] = new Point();
		
		points[0].x = 10;
		points[0].y = 20;
		points[0].dispPoint();
		

	}//main

}//class
