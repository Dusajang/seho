package days17;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author dkrkdfla
 * @date 2024. 7. 23.오전 11:22:51
 * @subject
 * @content     문자열 내림차
 *
 */
public class Ex01_03 {

	public static void main(String[] args) {
		String[] names = {
				"김재민",
				"김선우",
				"김인경",
				"송세호",
				"전재윤"	
		};
		Arrays.sort(names);  // 오름차순 정렬
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, Collections.reverseOrder());//내림차순 정렬
		System.out.println(Arrays.toString(names));

	}

}