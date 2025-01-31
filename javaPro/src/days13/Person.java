package days13;

public class Person {
		
		//field
		private String name = "익명";
		private int age = 20;
		private boolean gender = false;
		
		//constructor
		public Person() {}
		public Person(String n, int a, boolean g) {
			name = n;
			age = a;
			gender = g;
		}
		
		public Person(String n) {
			name = n;
		}
		public Person(String n, int a) {
			name = n;
			age = a;
		}
		//method
		public void dispPerson() {
			System.out.printf(">이름 : %s, 나이 : %d\n"
										, name, age);
		}
		
		//getter, setter
		public void setAge(int _age) {		//쓰기 전용
			if (0>_age || _age>150) {
				throw new NullPointerException();
			}else {
				age = _age;
			}
		}
		public int getAge() {		//읽기 전용
			return age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isGender() {
			return gender;
		}

		public void setGender(boolean gender) {
			this.gender = gender;
		}

		
}//Person




