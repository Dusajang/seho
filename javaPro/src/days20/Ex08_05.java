package days20;

import java.util.ArrayList;

/**
 * @author dkrkdfla
 * @date 2024. 7. 26.오후 3:30:00
 * @subject
 * @content
 *
 */
public class Ex08_05 {

	public static void main(String[] args) {
		/*
		 * [제한된 제네릭 클래스]
		 * <T extends Fruit>
		 * <T extends Fruit & eatable> 의미 이해
		 */
/*
		//Box4<Toy> toyBox = new Box4();
		//Box4<빵> 빵Box = new Box4();
		Box4<Apple> appleBox = new Box4();
		Box4<Grape> grapeBox = new Box4();
*/
	}//main

}//class

/*
// 제한된 제네릭 클래스
//class Box4<T>{
//class Box4<T extends Fruit>{
	class Box4<T extends Fruit & eatable>{
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {  this.list.add(item); }

	int size() { return this.list.size(); }

	T get(int i) { return this.list.get(i); }

	public String toString() { return  this.list.toString();  }  
}

//먹을 수 있는 음식...
interface eatable{
	//
}

class 빵 implements eatable{
	//
}

//과일
class Fruit extends Object implements eatable{
	public String toString() {
		return "Fruit";
	}
}
//과일<-사과
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}   
}
//과일<-포도
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}   
}
//장난감
class Toy{
	public String toString() {
		return "Toy";
	}   
}

*/




