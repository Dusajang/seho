package days14;


// 사원클래스
// 모든 사원들이 공통적으로 사지고 있을 멤버들을 선언.
//@Getter
public abstract class Employee {

	//필드
	private String name;
	private String addr;
	private String tel;
	private String hiredate;
	
	//생성자
	public Employee() {
		super(); // 코딩 안해도 컴파일러가 자동을 추가
		System.out.println(">Employee 디폴트 생성자 호출됨");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println(">Employee 4 생성자 호출됨");
	}
	
	//getter, setter

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	//메서드
	//사원들의 정보를 출력하느 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s, 주소 : %s, 연락처 : %s, 입사일자 %s\n"
				,this.name, this.addr, this.tel, this.hiredate);
	}
	
	
	/*
	// 가상메서드  자바에서는 사용하지 않는 용어
	public int getPay() {
		return 0;
	}
	*/
	
	//추상메서드 - 몸체가 구성안된 불완전한 메서드
	//This method requires a body instead of a semicolon
	public abstract int getPay() ;
	
	
	
}
