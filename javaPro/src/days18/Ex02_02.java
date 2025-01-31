package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author dkrkdfla
 * @date 2024. 7. 24.오전 11:06:43
 * @subject        2. Decimal Format
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) throws ParseException {
		//Decimal Format
		int money = 3276500;    // "3,276,500"
		
		/* 1.
		String smoney = String.format("%,d", money);
		System.out.println(smoney);
		*/
		
		/* 2.
		//String pattern = "#,###.##";
		//String pattern = "#,###.00";
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String smoney = df.format(money);
		System.out.println(smoney);
		*/
		
		String s ="3,123.23";
		/*
		s.replace(",", "");
		System.out.println(s);
		double d  = Double.parseDouble(s);
		System.out.println(d);
		*/
		
		String pattern = "#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		double d = (double) df.parse(s);
		System.out.println(d);

	}//main

}//class











