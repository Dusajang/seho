package days21;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

/**
 * @author dkrkdfla
 * @date 2024. 7. 29.오후 2:10:10
 * @subject
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {

		String content = "package days21;\r\n"
				+ "\r\n"
				+ "public class Ex01 {\r\n"
				+ "\r\n"
				+ "   //enum Direction{ EAST, SOUTH, WEST, NORTH }\r\n"
				+ "   enum Direction{\r\n"
				+ "      EAST(100, \"▶\"), \r\n"
				+ "      SOUTH(200, \"▼\"), \r\n"
				+ "      WEST(300, \"◀\"), \r\n"
				+ "      NORTH(400,\"▲\");\r\n"
				+ "      \r\n"
				+ "      private int value;\r\n"
				+ "      private String symbol;\r\n"
				+ "      \r\n"
				+ "      Direction(int value){\r\n"
				+ "         this.value = value;\r\n"
				+ "      }\r\n"
				+ "\r\n"
				+ "      Direction(int value, String symbol) {\r\n"
				+ "         \r\n"
				+ "      }\r\n"
				+ "      \r\n"
				+ "      public int getValue() {\r\n"
				+ "         return this.value;\r\n"
				+ "      }\r\n"
				+ "      \r\n"
				+ "      public String getSymbol() {\r\n"
				+ "         return this.symbol;\r\n"
				+ "      }\r\n"
				+ "      \r\n"
				+ "   }\r\n"
				+ "   \r\n"
				+ "   /*\r\n"
				+ "    * 컴파일러가 클래스로 변환\r\n"
				+ "    * class Direction extends Enum{\r\n"
				+ "    *    static final Direction EAST = new Direction();\r\n"
				+ "    * \r\n"
				+ "    *    private String name;\r\n"
				+ "    *    public String name(){\r\n"
				+ "    *       return this.name;\r\n"
				+ "    * }\r\n"
				+ "    *    private int ordinal;\r\n"
				+ "    *    public int ordinal(){\r\n"
				+ "    *       return this.ordinal;\r\n"
				+ "    * }\r\n"
				+ "    */\r\n"
				+ "   \r\n"
				+ "   public static void main(String[] args) {\r\n"
				+ "      \r\n"
				+ "      Direction[] dirArr = Direction.values();\r\n"
				+ "      for (Direction dir : dirArr) {\r\n"
				+ "         System.out.println(\r\n"
				+ "               dir.name() + \"/\"\r\n"
				+ "               + dir.ordinal() + \"/\"\r\n"
				+ "               + dir.getSymbol() + \"/\"\r\n"
				+ "               + dir.getValue());\r\n"
				+ "      }\r\n"
				+ "      \r\n"
				+ "      \r\n"
				+ "   }\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "";

		//문제 Ex01.java 파일의 21번째 라인의 문자열
		//String line21 변수에 저장한 후 출력

		// 풀이 1
//		String [] datas = content.split("\r\n");
//		String line21 = datas[20];
//		System.out.println(line21);
		
		//풀이 2
		//StringReader    StringWriter
//		StringReader reader = new StringReader(content);
//		BufferedReader br = new BufferedReader(reader);
//		for (int i = 0; i < 20; i++)  br.readLine();
//		String line21 = br.readLine();
//		System.out.println(line21);
		
		// 풀이 3
		// String [] -> Stream<String> -> 20라인 스킵 -> 21..  Optional<String>
		Stream.of( content.split("\r\n") ).skip(20).findFirst().get();
		


}//main

}//class







