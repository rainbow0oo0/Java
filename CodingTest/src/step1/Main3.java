package step1;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/10
 * 이름 : 이준우
 * 내용 : 백준 1단계 3번 문제
 * 
 * 문제
	두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

	출력
	첫째 줄에 A-B를 출력한다.

	예제 입력 1 
	3 2
	예제 출력 1 
	1 
 */

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// System.out.println("a : " - a);
		// System.out.println("b : " - b);
		
		System.out.println(a-b);
		
	}
}
