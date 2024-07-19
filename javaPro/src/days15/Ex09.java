package days15;

/**
 * @author dkrkdfla
 * @date 2024. 7. 19.오후 4:16:40
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		//클래스들 간의 관계
		// 1) has - a 관계 : Engine, Car
		// 2) is - a 관계
		
		//HEngine
		Engine hengine = new HEngine();
		Car c1 = new Car(null);
		
		Engine kengine = new HEngine();
		Car c50001 = new Car(kengine);
		
		Engine sengine = new SEngine();
		c50001.setEngine(sengine);
		
		

	}//main

}//class
