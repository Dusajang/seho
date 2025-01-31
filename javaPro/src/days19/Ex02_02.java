package days19;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25.오전 11:10:42
 * @subject      
 * @content     List                  Set                Map
 *            1) [ArrayList]
 *            2) [Vector 컬렉션 클래스]
 *				차이점 : 멀티 스레드 안전(동기화 처리ㅇ)
 *
 * StringBuffer   멀스 안전0, 동기화0
 * StringBuilder  멀스 안전x, 동기화 x
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {

		Vector vt = new Vector();   //기본(10)
		vt.addElement("김재민");
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);
		
		
		System.out.println("=".repeat(30));
		ListIterator ir = vt.listIterator();        // 양방향
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println("-".repeat(30));
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
		
		
	}//main

}//class










