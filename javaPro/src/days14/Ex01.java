package days14;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		//6. [취업 문제] ego(자아)
		String n = "keNik";   
		String m= "kKnie";   

		char[] nArr = n.toUpperCase().toCharArray();
		char[] mArr = m.toUpperCase().toCharArray();
		
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		
		//System.out.println(Arrays.equals(nArr, mArr));
		
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);
		System.out.println(n.equals(m));


	}

}