package days11;

/**
 * @author dkrkdfla
 * @date 2024. 7. 15.오후 5:12:13
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		int[][] m = new int [5][5];
		
		//magicSquare(m);
		
		fillM6(m);
		//fillM5(m);
		//fillM4(m);
		//fillM3(m);
		//fillM2(m);
		//fillM(m);
		
		disM(m);

	}//main
	
	
	/*마방진
	[17][24][01][08][15]
	[23][05][07][14][16]
	[04][06][13][20][22]
	[10][12][19][21][03]
	[11][18][25][02][09]
	*/
	private static void magicSquare(int[][] m) {
		//1. 0행 2열     1
		//2. 출력값이 5의 배수 o 행만 증가
		//                         x  행 감소, 열 증가
		//                               ㄴ행 범위 벗어남 -> 가장 큰 행 값
		//                                          ㄴ열 범위 벗어남 -> 가장 작은 열 값
		
		
		int n = 1;
		int row = 0, col = m[0].length/2;
		while (n<=25) {
			m[row][col] = n;
			
			if (n%5==0) {
				row++;
			} else {
				col++;
				row--;
				if (row==-1) row = m.length-1;
				if(col==5) col = 0;
			}
			
			n++;
		}//while
		
		
		
		
		
		
		/*
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 2; j < m.length; j++) {
				int start = j;
				if(sum%5==0) i++;
				if(sum%5!=0) {i--,j++;}
				m[i][j] = sum++; 
			}
		}
		*/
	} // magicSquare
	
	
	// 대각선
		//	[01][02][04][07][11]
		//	[03][05][08][12][16]
		//	[06][09][13][17][20]
		//	[10][14][18][21][23]
		//	[15][19][22][24][25]
		private static void fillM6(int[][] m) {
			int n = 1;
			int row = 0, col = 0;
			while (n<=25) {
				m[row][col] = n;
				if (row <= col) {
					row--;col++;
				} 
				n++;
			}

		}//대각선
	
	
	
	// [골뱅이]
		/*
		  [01][02][03][04][05] 0행	1회전 행고정, 열증가(5번)
		  [16][17][18][19][06] 1행	2회전 행증가, 열고정(4번)
		  [15][24][25][20][07] 2행	3회전 행고정, 열감소(4번)
		  [14][23][22][21][08] 3행	4회전 행감소, 열고정(3번)
		  [13][12][11][10][09] 4행	5회전 행고정, 열증가(3번)
		  										6회전 행증가, 열고정(2번)
		  										7회전 행고정, 열감소(2번)
		  										8회전 행감소, 열고정(1번)
		  										9회전 행고정, 열증가(1번)
		  										반복횟수 =5
		  										스위치변수 +1(증가) -1(감소)
		  										
		*/
		private static void fillM5(int[][] m) {
			
			
			
			
			
			
			
			/*
			for (int i = 0; i < m.length; i++) { 
		         for (int j = 0; j < m[i].length; j++) { 
		        	 if(i==0 && i<=j) m[i][j] = i*5+j+1;
		        	 if(i<=j && j==4) m[i][j] = i+j+1;
		        	 if(i==1 && j<4 && j>0) m[i][j] = 16+j;
		        	 if(i>1 && i<4 && j==3) m[i][j] = j*6+i;
		        	 if(i==2 && j>0 && j<3) m[i][j] =23+j;
		         }
			}
		         for (int k = 4; k >= 0; k--) {
		        	 for (int l = 4; l >= 0; l--) {
						if(k>l && k==4) m[k][l] = k-l+9;	
						if(l==0 && k>0) m[k][l] = 17-k;
						if(k==3 && l>0 && l<3) m[k][l] = 24-l;
					}	
				}
		     */
		      
		}//골뱅이
	
	
	/* 지그재그
	[01][02][03][04][05]
	[10][09][08][07][06]
	[11][12][13][14][15]
	[20][19][18][17][16]
	[21][22][23][24][25]
	*/
	private static void fillM4(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	        	if (i%2 == 0) m[i][j] = (i*5)+j+1;
	        	else m[i][j] = (i*10)-j;
	         } // for j
	         System.out.println();
	      } // for i
	}//지그재그
	
	
	
	/*
	[05][10][15][20][25]
	[04][09][14][19][24]
	[03][08][13][18][23]
	[02][07][12][17][22]
	[01][06][11][16][21]
	*/
	private static void fillM3(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	        	 //			열 갯수
	            m[i][j] = -i+((j+1)*5);
	         } // for j
	         System.out.println();
	      } // for i
	      
	}
	

	private static void fillM2(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	        	 //			열 갯수
	            m[i][j] = 25-(i*5)-j;
	         } // for j
	         System.out.println();
	      } // for i
		
	}

	private static void fillM(int[][] m) {
		int count = 1;
		for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	        	 //			열 갯수
	        	m[i][j] = m[i].length * i + j +1;
	         } // for j
	         System.out.println();
	      } // for i
		
	}

	private static void disM(int[][] m) {
	      System.out.println();
	      System.out.println(); 
	      
	      for (int i = 0; i < m.length; i++) { // 행갯수
	         for (int j = 0; j < m[i].length; j++) { // 열갯수
	            System.out.printf("[%02d]", m[i][j]);
	         } // for j
	         System.out.println();
	      } // for i
		
	}//disM()

}//class








