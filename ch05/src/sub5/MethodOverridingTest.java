package sub5;

/*
 * 날짜 : 2025/07/15
 * 이름 : 이준우
 * 내용 : 메서드 오버라이딩 실습하기
 * 오버라이딩 : 덮어쓰기
 */

class AAA { // 
	public void method1() {
		System.out.println("AAA: method1...");
	}
	public void method2() {
		System.out.println("AAA: method2...");
	}
	public void method3() {
		System.out.println("AAA: method3...");
	}
}

class BBB extends AAA{ // class BBB는 AAA를 상속
	
	@Override
	public void method2() {
		// 부모클래스 method2를 Override하기 때문에 이노테이션 @Override 표시
		System.out.println("BBB: method2...");
	}
	public void method3(int a) { // Overload 메서드
		System.out.println("BBB: method3...");
	}	
}

class CCC extends BBB{ // class CCC는 BBB를 상속
	
	@Override
	public void method1() {
		System.out.println("CCC: method1...");
	}
	
	@Override
	public void method2() { 
		System.out.println("CCC: method2...");
	}
	public void method3(int a, int b) { // Overload 메서드
		System.out.println("CCC: method3...");
	}	
}


public class MethodOverridingTest {
	
	public static void main(String[] args) {
		
		CCC c = new CCC(); // c로 선언한 CCC는 CCC()의 값 출력?
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		// Sedan 클래스 오버라이드 매서드 실습
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(200); // 200으로 했지만 180
		sonata.show();		
		
	}	
}
