package days19;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dkrkdfla
 * @date 2024. 7. 25.오후 12:36:19
 * @subject
 * @content      큐 queue
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 큐(Queue) 구조   FirstInFirstOut        offer()      poll()/peek()
		// 양방향 입출  -> 더블 큐(Deque)
		
		//Queue q = new LinkedList();
		Deque q = new LinkedList();
		q.offer("전재윤");
		q.offer("김재민");
		q.offer("김준석");
		q.offer("박준용");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}//main

}//class
