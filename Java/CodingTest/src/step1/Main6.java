package step1;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/10
 * 이름 : 이준우
 * 내용 : 백준 1단계 5번
 * 문제
	두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫),
	A%B(나머지)를 출력하는 프로그램을 작성하시오. 

	입력
	두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

	출력
	첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B,
	다섯째 줄에 A%B를 출력한다.
 */

public class Main6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Scanner 용자 입력을 받아오는 도구
		// (System.in) → 키보드로 입력할 수 있게
		// 선언만 변수를 미리 만들어두고 나중에 키보드로 값 넣기
		// Scanner를 사용하면 위에 import가 나오게 됨
		
		int A = sc.nextInt(); // 변수를 선언과 초기화를 동시에
		int B = sc.nextInt();				
	
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		// ""가 붙으면 문자열이라 그대로 출력
		// %는 공책에 설명
		
	}
}
