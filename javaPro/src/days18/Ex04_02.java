package days18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class Ex04_02 {
	
	public static void main(String[] args) {
		//배열 단점
		// 요소의 추가 제거가 불편함
		
		//<E> 제네릭 클래스   Element == 요소
		//ArrayList list = new ArrayList(10);
		ArrayList list = new ArrayList(3);
		System.out.println(list.size());
		list.add("이시훈");
		list.add("원충희");
		list.add("김준석");
		System.out.println(list.toString());    //toString() 생략 가능하다.
		System.out.println(list);
		System.out.println(list.size());
		list.add("송세호");
		System.out.println(list);
		
		System.out.println( list.contains("원충희") );    //true/false 값으로 반환
		
		list.add("원충희");
		
		System.out.println( list.indexOf("원충희") );
		System.out.println( list.lastIndexOf("원충희") );
		
		//3 인뎃스 요소의 값을 얻어와서 출력
		//배열명[3] = ??
		
//		list.clear();       모든 요소(element) 삭제
//		System.out.println(list);
		
		list.set(1, "전재윤");   // 수정
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		//원충희 찾아서 삭제
		int index = list.indexOf("원충희");
		//list.remove(index);  // 삭제한 후의 리스트를 리턴
		//list.remove("원충희");
		System.out.println(list);
		
		/*
		// <E>Element    <T>Type
		list.removeIf(new Predicate<T>() {

			@Override
			public boolean test(Sting t) {
				
				return t.equals("원충희");
			}
		});
		*/
		
		//list.removeIf(i -> i.equals("원충희"));
		//System.out.println(list);
		
		//System.out.println( list.isEmpty() );
		
		/*
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		*/
		
		//list.sort((o1,o2) -> (o2).compareTo(o1));
		//list.sort(Comparator.reverseOrder());
		//System.out.println(list);
		
		//list의 모든 요소를 출력
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		//iterator == 반복자
		Iterator ir = list.iterator();
		while (ir.hasNext()) {                    //hasNext() : 읽어올 요소가 남아있는지 확인하는 메서드, 요소가 있으면 true, 없으면 false
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		
	}//main

}//class


















