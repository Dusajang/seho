package days20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Ex03_02 {

	public static void main(String[] args) {
		/*
		 * Map : 해시맵 해시테이블 트리맵 솔티드맵,  Properties 컬렉션 클래스
		 *  1. HashTable<String, String> == Properties
		 *  2. key + value = entry
		 *  3. 환경 설정값들을 파일로 저장/읽기
		 *                            put()/get()
		 *                            setProperties() / getProperties()
		 *  4. 저장되는 파일확장자 : .properties
		 *      store(), storeToXML() - 저장
		 *      load() - 읽기
		 */
		// 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 ) 
	      String className = "oracle.jdbc.driver.OracleDriver";            
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
	      String user = "scott";                                                                   
	      String password = "tiger";  
	      
	      Properties p = new Properties();
	      p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
	      p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
	      p.setProperty("user", "scott");
	      p.setProperty("password", "tiger");
	      
	      String fileName = ".\\src\\days20\\jdbcConfig.XML";
	      //FileReader, BufferedReader
	      //FileWriter
	      try (FileOutputStream outputStream = new FileOutputStream(fileName)){
	    	  p.storeToXML(outputStream, "jdbc config sample.");
	    	  
			System.out.println("SAVE END");
		} catch (Exception e) {
			e.printStackTrace();
		}
	      
	      

	}//main

}//class









