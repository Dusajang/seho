package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author dkrkdfla
 * @date 2024. 7. 29.오전 11:15:50
 * @subject      Ex01.java -> Ex01Copy.java
 * @content      FileReader   Filewriter
 *                  1문자씩 읽어와서 그대로 쓰면 -> 복사
 *                  버퍼(Buffer)
 *                  BufferedReader   BufferedWriter
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {

		String sourceFile = ".\\src\\days21\\Ex01.java";
		String copyFile = "";

		int idx = sourceFile.lastIndexOf("\\");
		System.out.println(idx);

		String parent = sourceFile.substring(0, idx);
		System.out.println(parent);
		String child = sourceFile.substring(idx+1);
		System.out.println(child);

		idx = child.indexOf(".");
		String fileName = child.substring(0, idx);
		System.out.println(fileName);
		String ext = child.substring(idx);
		System.out.println(ext);
		fileName += "Copy";

		copyFile = String.format("%s\\%s%s", parent, fileName, ext);
		System.out.println(copyFile);

		fileCopyTextStream(sourceFile, copyFile);


		//> 복사 처리 시간 : 2935800(ns)
		//> 복사 처리 시간 : 692000(ns)

	}//main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();

		final int BUFFER_SIZE = 1024;

		try (FileReader reader = new FileReader(sourceFile);
				FileWriter writer = new FileWriter(copyFile);
				BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);
				BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);
				){
			/*
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
			}//while
			 */
			char [] cbuf = new char[BUFFER_SIZE];

			int readCharNumber;
			while (  (readCharNumber = br.read(cbuf)  ) != -1 ) {      //실제 읽어온 값은 cbuf, 읽어온 갯수는 readCharNumber
				bw.write(cbuf, 0, readCharNumber);
			}//while

			System.out.println("파일 복사 완료");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}//class
