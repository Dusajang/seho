package days15;

import days14.Employee;
import days14.Regular;

/**
 * @author dkrkdfla
 * @date 2024. 7. 19.오전 11:25:25
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		/*[다형성(polymorphism]
		 * - 여러 가지 형태를 가질 수 있는 능력
		 * - E e1 = new R();
		 * - E e1 = new S();
		 * - E e1 = new T();
		 * 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있는 것
		 * 
		 * 
		 */
		
		/*
		Regular emp1 = new Regular("전재윤", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
		SalesMan emp2 = new SalesMan("김준석", "경기도 남양주", "010-9837-2342", "2021.03.12", 50000, 20, 70000);
		Temp emp3 = new Temp("김재민", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		
		System.out.println(emp1.getPay());
		System.out.println(emp2.getPay());
		System.out.println(emp3.getPay());
		*/
		
//		Employee[] emps = new Employee[3];
//		emps[0] = new Regular("전재윤", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000);
//		emps[1] = new SalesMan("김준석", "경기도 남양주", "010-9837-2342", "2021.03.12", 50000, 20, 70000);
//		emps[2] = new Temp("김재민", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		
		//클래스 배열 초기화
		Employee [] emps = {
				new Regular("전재윤", "서울 양천구", "010-3123-2311", "2021.03.21", 4000000),
				new SalesMan("김준석", "경기도 남양주", "010-9837-2342", "2021.03.12", 50000, 20, 70000),
				new Temp("김재민", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000)
		};
		
		
		for (int i = 0; i < emps.length; i++) {
			//System.out.println(emps[0].getPay());
			printEmpPay(emps[i]);
		}
		

	}//main
	
	//                                      매개변수 다형성
	public static void printEmpPay(Employee emp) {
		//Employee emp = R/S/T   instanceof 연산자   파악 -> 다운캐스팅 처리
	}
	
	
	
	

}//class
