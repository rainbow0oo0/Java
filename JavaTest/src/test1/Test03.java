package test1;

/*
 * 날짜 : 2025/07/09
 * 이름 : 이준우 
 * 내용 : 자바 기본 입출력 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
		
		int num = 1; // 선언만 하고 초기화 ?
		int result;
				
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);		
	}
}
