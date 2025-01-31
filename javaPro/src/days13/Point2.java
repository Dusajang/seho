package days13;

public class Point2 {

		private int x;
		private int y;
		
		//constructor
		//디폴트 생성자 추가
		public Point2() {
		}
		
		public Point2(int a, int b) {
			//필드 초기화
			x=a;
			y=b;
		}
		
		//getter setter
		public int getX() {
			return x;
		}



		public void setX(int x) {
			this.x = x;
		}



		public int getY() {
			return y;
		}



		public void setY(int y) {
			this.y = y;
		}



		public void dispPoint() {
			System.out.printf(">x=%d, y=%d\n", x, y);
		}

		
		
		public void plusPoint(Point2 p) {
			x = x + p.x;
			y = y + p.y;
		}
		
		
		
		public Point2 plusPoint(Point2 p1, Point2 p2) {
			int x = p1.x + p2.x;
			int y = p1.y + p2.y;
			Point2 p = new Point2();
			p.x = x;
			p.y = y;
			return p;
		}
}
