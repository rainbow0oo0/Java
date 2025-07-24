package test6;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이준우
 * 내용 : 자바 총정리 연습문제
 * 
 * 원주율
 * - ㅠ = 4 x (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 * 
 * 
 */

public class Test05 {
	
	public static void main(String[] args) {
		
		boolean sign = false;
		double pi = 0;
		
		for(int i = 1; i <= 10000000; i += 2) {
			
			if(??) {
				pi += 1.0 / i;
				sign = true;
			}else {
				pi -= 1.0 / i;
				sign = false;
			}
			
			System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
		}
		
		
	}
}
