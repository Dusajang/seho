package days15;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String a = "aBcDeFg";
	        
	       char[] m = new char[7];
	        
	        for (int i = 0; i < args.length; i++) {
				if (m[i]>='A' && m[i]<='Z') {m[i] = (char) (m[i]+32);}
				if (m[i]>='a' && m[i]<='z') {m[i] = (char) (m[i]-32);}
				
			}
	        System.out.println(Arrays.toString(m));
		

	}

}
