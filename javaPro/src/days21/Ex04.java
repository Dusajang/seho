package days21;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dkrkdfla
 * @date 2024. 7. 29.오전 10:07:24
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		// days21.Ex01.java
		// 텍스트 파일 -> 문자스트림
		// 파일       +문자 스트림 = FileReader, FileWriter
		// [File 클래스]
		// 파일+디렉토리(폴더)을 다루는 여러 기능이 구현된 클래스
		//                             (생성, 파일 삭제, 파일 정보, 파일명 변경 등등)
		
		//String parent = ".\\src\\days21";
		File parent = new File(".\\src\\days21");
		String child = "Ex01.java";
		File file = new File(parent, child);
		System.out.println(file.length() + "(byte)");
		System.out.println(file.isDirectory() + "/" + file.isFile());
		
		long ms = file.lastModified();
		//System.out.println(ms);    //1722215201517
		// 년 월 일 시간 분 초 출력
//		String fileTime = "";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일  hh시간 mm분 SS초");
//		System.out.println( sdf.format(ms) );
		
		Date d = new Date(ms);
		//System.out.println(d.toLocaleString());
		String pattern = "yyyy년 MM월 dd일  hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d));
		
		
		try (FileReader reader = new FileReader(file)){
			int code;
			while ((  code = reader.read()  ) != -1) {
				System.out.printf("%c", (char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}//main

}//class
