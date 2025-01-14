package days15;

/**
 * @author dkrkdfla
 * @date 2024. 7. 19.오후 4:52:10
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		
		String parsingFile = "hello. html";
		String docType = "html";
		
		Parseable parser = ParderManager.getParser(docType);
		parser.parse(parsingFile);
		
		
		System.out.println(" end ");


	}//main

}//class

interface Parseable{
	void parse(String filename); // 파일명 파싱(구문분석)하는 메서드
	default void print() {
	}
}

class XMLParser implements Parseable{

	@Override
	public void parse(String filename) {
		System.out.println(">XML 파일 구문 분석 코딩");
	}
	
	public void print() {
		System.out.println("> XML 파일 구문 분석 후 인쇄 코딩...");
	}

}

class HTMLParser implements Parseable{

	@Override
	public void parse(String filename) {
		System.out.println(">HTML 파일 구문 분석 코딩");
	}

}

class ParderManager{
	
	public static Parseable getParser(String docType) {  // XML     HTML
		if (docType.equals("xml")) {
			return new XMLParser();
		}else if (docType.equals("html")) {
			return new HTMLParser();
		}else {
			return null;
		}
	}
}








