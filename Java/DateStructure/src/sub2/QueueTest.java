package sub2;

/*
 * 날짜 : 2025/07/08
 * 이름 : 이준우 
 * 내용 : 자바 QueueTest 실습하기
 */

public class QueueTest {
	
	public static void main(String[] args) {
		
		int[] queue = new int[5];
		
		int front = 0;
		int rear = 0;
		
		// 데이터 삽입(enqueue)
		queue[rear++] = 10; 
		queue[rear++] = 20;
		queue[rear++] = 30;
		queue[rear++] = 40;
		queue[rear++] = 50;
		
		
		// queue[rear++] = 20;
		// for(int num : queue) {
		// 	System.out.print(num + ", ");
		// }
		
		for(int num : queue) {
			System.out.print(num + ", ");
		}
		
		// 데이터 삭제
		queue[front] = 10;
		int removed = queue[front++];		
		System.out.println("삭제 값 : " + removed);

		
		
	} // main end		
}
