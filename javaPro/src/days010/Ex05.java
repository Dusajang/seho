package days010;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author dkrkdfla
 * @date 2024. 7. 12.오후 4:45:02
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		int [] m = { 8, 3, 3, 0, 1, 7, 0, 1, 1, 4, 2, 0, 1, 7, 1, 9, 3, 9, 5, 0, 5, 0, 0, 9, 1, 4, 7, 8, 3, 2, 1, 7, 1, 1, 7, 3, 8, 3, 4, 0, 4, 3, 2, 3, 6, 1, 3, 1, 8, 8, 0, 4, 1, 8, 9, 9, 2, 2, 2, 5, 2, 7, 6, 1, 2, 0, 6, 6, 2, 6, 4, 9, 7, 8, 0, 6, 7, 6, 6, 0, 7, 3, 9, 2, 5, 6, 7, 8, 7, 7, 7, 5, 1, 3, 2, 7, 9, 8, 0, 4};
		//System.out.println(m.length);
		
		//int max = IntStream.of(m).max().getAsInt();
		
		/*
		int[] one = {0,1,2,3,4,5,6,7,8,9};
		
		int count = 0;
		
		for (int i = 0; i < one.length; i++) {
			count = 0;
			for (int j = 0; j < m.length; j++) {
				if (one[i]==m[j]) {
					count++;
				}
			}
			System.out.printf("%d - %d개\n", one[i], count);
		}
		*/
		
		int[] cnts = new int[10];
		
		for (int i = 0; i < m.length; i++) {
			cnts[m[i]]++;
			}
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("%d - %d개\n", i, cnts[i]);
		}
		
		
	}//main
	

}//class



/*
int max = 0;
int min = 0;

for (int i = 0; i < m.length; i++) {
	if (max < m[i]) {
		max = m[i];
	}
	if (min > m[i]) {
		min = m[i];
	}
}
System.out.println(max);
System.out.println(min);
*/


/*
int cnt0, cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7, cnt8, cnt9;
cnt0=cnt1= cnt2= cnt3= cnt4= cnt5= cnt6= cnt7= cnt8= cnt9=0;
for (int i = 0; i < m.length; i++) {
	switch (m[i]) {
	case 0:		cnt0++		break;
	case 1:				break;
	case 2:				break;
	case 3:				break;
	case 4:				break;
	case 5:				break;
	case 6:				break;
	case 7:				break;
	case 8:				break;
	case 9:		cnt9++		break;

	default:
		break;
	}
}
*/