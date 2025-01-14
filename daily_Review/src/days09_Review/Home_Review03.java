package days09_Review;

public class Home_Review03 {

	public static void main(String[] args) {
		// 3. 10진수 125를 2바이트 2진수로 출력하기
		
		int a = 125;
		int share, reminder;
		
		int[] binaryArr = new int[32];
		int index = binaryArr.length-1;
		
		while (a != 0) {
			share = a/2;
			reminder = a%2;
			binaryArr[index--] = reminder;
			a = share;
		}//while
		
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if(i%8==7) System.out.print(" ");
		}
		System.out.println();

	}//main

}//class

/*
String binary = Integer.toBinaryString(a);
String octa = Integer.toOctalString(a);
String hex = Integer.toHexString(a);

System.out.println(binary);
System.out.println("0"+octa);
System.out.println("0x"+hex);
*/

/*
int share, reminder;

int binaryArr[] = new int[32];

int index = binaryArr.length-1;

while (a != 0) {
	share = a/2;
	reminder = a%2;
	binaryArr[index--] = reminder;
	a=share;
}//while

for (int i = 0; i < binaryArr.length; i++) {
	System.out.printf("%d", binaryArr[i]);
	if(i%8==7)System.out.print(" ");
}
System.out.println();
*/