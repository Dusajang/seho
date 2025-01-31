package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		/*
		6. "SS21_Team.txt"  파일을 읽어서 본인의 팀원들만의 이름을 teamMember 배열에 
		저장한 후 팀장명을 제외한 나머지 팀원들의 이름을  
		내림차순으로 정렬해서 아래와 같이 출력하는 코딩을 하세요.
		[실행결과]  예 : 
		[ 2조 ]
		<ul>
			<li class="leader">박우현</li>
			<li>이동찬</li>
			<li>윤형준</li>
			<li>유진</li>
			<li>원대안</li>
		</ul>
		*/
		String fileName = "C:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days17\\SS21_Team.txt";
		String content = getFileContent(fileName);
		
		content = content.replace("1조", "[1조]");
		content = content.replace("2조", "[2조]");
		content = content.replace("(전)", "");
		content = content.replace("(비)", "");
		content = content.replace(",", "\r\n");
		content = content.replace(" ", "");
		
		content = content.replace("[팀장]", "<li class=\"leader\">");
		content = content.replace("김선우", "<li>김선우</li>");
		content = content.replace("김인경", "<li>김인경</li>");
		content = content.replace("송세호", "<li>송세호</li>");
		content = content.replace("전재윤", "<li>전재윤</li>");
		content = content.replace("최사랑", "<li>최사랑</li>");
		content = content.replace("박준용", "<li>박준용</li>");
		content = content.replace("원충희", "<li>원충희</li>");
		content = content.replace("이시훈", "<li>이시훈</li>");
		
		
		
		

		
		
		
		
		System.out.println(content);

	}//main

	private static String getFileContent(String fileName) {
	    FileReader reader = null;

	    BufferedReader br = null;
	    int one = -1;

	    String content = "";
	    try {
	      reader = new FileReader(fileName);
	      br = new BufferedReader(reader);


	      String line = null;
	      int lineNum = 1;
	      while ((line = br.readLine()) != null) {

	        content += line + "\r\n";
	      }

	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    } finally {
	      if (reader != null) {
	        try {
	          reader.close();
	          reader = null;
	          br.close();
	          br = null;
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	    return content;
	  }
	
}//class
