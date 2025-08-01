package P233;

/*
 * 날짜 : 2025/07/18
 * 이름 : 이준우
 * 내용 : 교재P224 실습 
 * 
 */

class Calc {
	public static int abs(int a) {
		return a>0 ? a:-a;
	}
	
	public static int max(int a, int b) {
		return (a>b) ? a:b;
	}
	
	public static int min(int a, int b) {
		return (a < b) ? a:b;
	}
	
}

public class CalcEx {
	
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,  8));
		System.out.println(Calc.min(-3, -8));		
		
	}
}
