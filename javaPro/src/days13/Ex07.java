package days13;

/**
 * @author dkrkdfla
 * @date 2024. 7. 17.오후 2:37:59
 * @subject		[  this 키워드  ]
 * @content		1. 정의 : 클래스 자기 자신의 주소값(인스턴스가 생성되면)을 갖는 참조변수
 * 							Tv t1 = new Tv();		//변수, 참조 변수, 객체
 * 							Tv t2 = new Tv();
 * 							Tv [this];
 * 
 * 			[power][channel][color]xx[0x100]					[0x100]t1
 * 			0x100                              this 참조변수
 * 			[power][channel][color]xx[0x100]					[0x100]t1
 * 			0x200                              this 참조변수
 * 
 * 						2. this 세 가지 용도
 * 							ㄱ. 멤버(클래스의 구성요소) = 생성자, 필드, 메서드 (getter, setter)
 * 								 를 가리킬 때의 this 용도
 * 								
 * 								
 * 							ㄴ. 생성자에서 또 다른 생성자를 호출할 때의 this 용도
 * 							ㄷ. 리턴값, 매개변수값으로 사용되는 this 용도
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		p1.plusPoint(100).dispPoint();
		//p1.thisTest(this);
		
		Member m1 = new Member("홍길동", "목동");
		System.out.println(m1.getName() + "/" + m1.getAddr());
		
		Member m2 = new Member();
		System.out.println(m2.getName() + "/" + m2.getAddr());

	}//main

}//class

class Member{
	//field
	private String name;
	private String addr;
	
	
	
	//constructor
	public Member() {		//다른 코딩보다 제일 윗 라인에 있어야 함
		//super();
		this("익명", "미정");
		//
		//
	}
	
	public Member(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}








