package days21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author dkrkdfla
 * @date 2024. 7. 29.오후 2:28:49
 * @subject
 * @content
 *
 */
public class Ex09_02 {

	public static void main(String[] args) {
		//  DataInputStream / DataOutputStream
		// 바이트 스트림
		// 기본형 8가지를 읽기/쓰기
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		
		//student.txt 파일로 저장
		String fileName = ".\\src\\days21\\student.dat";
		try (FileInputStream fis = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(fis);){
			
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			
			avg = dis.readDouble();
			gender = dis.readBoolean();
			
			System.out.printf("%s %d %d %d %d %f %b\n"
					, name , kor, eng, mat, tot, avg, gender);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");

	}//main

}//class
