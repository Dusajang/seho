package days010;

public class Test02 {

	public static void main(String[] args) {
//		2. int [] m = new int[6];
//		   m[0]=1;m[1]=2;m[2]=3;m[3]=4;m[4]=5;m[5]=6; 
//		   1) 위의 코딩을 2행 3열 2차원 배열로 선언하세요
//		   2) 위의 코딩을 1차원 배열 초기화로 선언하세요.
//		   3)   1) 2행 3열 2차원 배열 초기화로 선언하세요.
//		   4) 1차원 배열을 for 문을 사용해서 출력하세요.
//		   5) 2차원 배열을 중첩 for 문을 사용해서 출력하세요.
		
		//1)
		int[][] m = {
								{1,2,3},
								{4,5,6}
						  };
		
		//2)
		//int[] m= {1,2,3,4,5,6};
		
		//3)
		//int[] m = [2][3];
		
		//4)
//		for (int i = 0; i < m.length; i++) {
//			System.out.printf("%d", m[i]);
//		}
		
		//5)
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d%d", m[i][j]);
			}
		}
	}

}
