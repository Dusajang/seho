package week02;

import java.util.Arrays;

public class Week02_Review05 {

	public static void main(String[] args) {
//		5. int [] m = {1,2,3}
//		   정수 4를 m 배열에 추가하는 코딩을 하세요.
		
		int [] m = {1,2,3};
		int size = m.length;
		
		int[] n = new int[m.length+1];
		
		for (int i = 0; i < m.length; i++)  n[i] = m[i];  n[3] = 4;
		
		m=n;
		
		System.out.println(Arrays.toString(m));

	}//main

}//class


 