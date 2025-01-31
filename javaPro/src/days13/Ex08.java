package days13;

/**
 * @author dkrkdfla
 * @date 2024. 7. 17.오후 3:37:05
 * @subject			[static 키워드] - 정적변수, 클래스 변수, 공유 변수 -> 메서드 영역에 올라감, 객체 생성 안해도 만들어짐
 * @content			Save 저축 클래스
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		Save s1 = new Save("김선우", 1000, 0.03);
		Save s2 = new Save("김인경", 10000, 0.03);
		Save s3 = new Save("김재민", 5000, 0.03);
		Save s4 = new Save("김준석", 15000, 0.03);
		Save s5 = new Save("박준용", 1000, 0.03);
		
		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
		*/
		//클래스 배열 선언+사용수정
		/*
		Save[] sArr = new Save[5];
		//[null][null][][][]                                0x100
		sArr[0]			    sArr[4]
		//0x100
		
		                        double
		[name][money][rate]
		0x200
		
		sArr[0] = new Save("김선우", 1000, 0.03);
		sArr[1] = new Save("김인경", 10000, 0.03);
		sArr[2] = new Save("김재민", 5000, 0.03);
		sArr[3] = new Save("김준석", 15000, 0.03);
		sArr[4] = new Save("박준용", 1000, 0.03);
		*/
		
		//클래스 변수 접근
		//클래스명.클래스 변수(static 변수)
		//System.out.println(Save.rate);
		Save.setRate(0.05);
		
		
		
		//클래스 배열 초기화
		Save[] sArr = {
								new Save("김선우", 1000, 0.03),
								new Save("김인경", 10000, 0.03), 
								new Save("김재민", 5000, 0.03), 
								new Save("김준석", 15000, 0.03), 
								new Save("박준용", 1000, 0.03)  
				
							};
		
		//sArr[2].setRate(0.07);		//객체로도 접근 가능
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}
		
		
		
		
		
	}//main

}//class








