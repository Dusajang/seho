package days11;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		//4. 1차원 배열을 2차원 배열로 변환
		
		//    i			 i    j
		//m[0] = n[0][0]	i*j+j
		//m[1] = n[0][1]
		//m[2] = n[0][2]
		
		//m[3] = n[1][0]	i*j+3
		//m[4] = n[1][1]
		//m[5] = n[1][2]
		
		   int [] m = {1,2,3,4,5,6};
		   int [][] n = new int[2][3];    
		   
		  for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[0].length; j++) {
				if(i==0) n[i][j] = m[(i*j)+j];
				if(i==1) n[i][j] = m[(i*j)+3];
				System.out.printf("n[%d][%d] = %d\n", i, j, n[i][j]);
			}
			}
		  
		   
		   
		   /*
		   int[][] n = {
					{1,2,3},
					{4,5,6}
				};
			*/


		
	}//main

	

}//class
