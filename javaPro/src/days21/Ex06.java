package days21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author dkrkdfla
 * @date 2024. 7. 29.오전 11:15:50
 * @subject      Ex01.java -> Ex01Copy.java
 * @content      FileInputStream   FileOutputStream
 *                  1문자씩 읽어와서 그대로 쓰면 -> 복사
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		String sourceFile = "C:\\Program Files\\Git\\git-bash.exe";
		String copyFile = "C:\\Users\\User\\Documents\\git-bash_copy.exe";


		//> 복사 처리 시간 : 773948800(ns)

		fileCopyBinaryStream(sourceFile, copyFile);


	}//main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);){
			int code;
			while ((code = fis.read()) != -1) {
				System.out.printf("%08d\n", Integer.parseInt( Integer.toBinaryString(code) ) );
				fos.write(code);
			}//while
			fos.flush();
			System.out.println("파일 복사 완료");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}//class
