package step1;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/10
 * 이름 : 이준우
 * 내용 : 백준 1단계 4번 문제
 * 문제
	두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

	출력
	첫째 줄에 A/B를 출력한다.
	제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
*/

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();	
		
		System.out.println((double) a/b);
		// double(형변환) 을 해야 실수로 나눠서 소수점 결과가 출력
		// double와 int의 차이는 소수점이 버려지는 차이
		
	}
}
