package days19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25.오후 4:16:09
 * @subject
 * @content           int 배열을 트리셋으로 변환하는 방법들
 *
 */
public class Ex11_03 {

	public static void main(String[] args) {
		int [] score = { 80, 95, 50, 85, 45, 65, 10, 100 };
		/*
	      for (int i = 0; i < score.length; i++) {
	         if( score[i] > 80  ) System.out.println( score[i]);
	      }
		 */

		// int []  ->    TreeSet<Integer> 변환
		/* [1]
	      TreeSet<Integer> ts = new TreeSet<>();
	      for (int i = 0; i < score.length; i++) {
	          ts.add( score[i] );
	      }
		 */

		// [2] int []  ->    TreeSet<Integer> 변환

		/*  Integer [] 변환 -> List<Integer> -> TreeSet<Integer>
	        Integer[] scoreArray = new Integer[]{80,95,50,85,45,65,10,100};
	        TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(scoreArray));
		 */

		/*
	      TreeSet<Integer> treeSet = Arrays.stream(score)
	                .boxed()
	                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		 */ 
		
		/*
	      Integer [] score ;
	      TreeSet<Integer> ts = new TreeSet<>();
	      Collections.addAll(ts, score);
	      */
		
		// int [] -> IntStream  -> boxed() Stream<Integer>-> collect() List ->  (ArrayList<Integer>)  -> TreeSet<Integer> 변환
	      ArrayList<Integer> list =  (ArrayList<Integer>) Arrays
	            .stream(score).boxed().collect(Collectors.toList());
	      TreeSet<Integer> ts = new TreeSet<Integer>(list);
	      
	      System.out.println( ts.tailSet(80) );
	      System.out.println( ts.tailSet(80, true) );  // true면 80포함
	      System.out.println( ts.tailSet(80, false) ); //  false면 80 제외
	      
	      //ts.headSet

	}//main

}//class







