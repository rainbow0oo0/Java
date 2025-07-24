package sub2;

/*
 * 날짜 : 2025/07/09
 * 이름 : 이준우 
 * 내용 : 자바 메서드 실습하기
 */

public class MethodTest {  // Java 파일은 class 구조체로서 Method로 구성
	
	
	// main 메서드 : Java 애플리케이션의 시작 메서드
	public static void main(String[] args) { 
		
		// 매서드 호출, f 안에 수 인자값
		int y1 = f(1);  // 인자값 1을 f메서드의 매개변수 x에 대입		
		int y2 = f(2);  // 인자값 2을 f메서드의 매개변수 x에 대입		
		int y3 = f(3);  // 인자값 3을 f메서드의 매개변수 x에 대입
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);	
		
		// 지역변수와 메서드 호출
		int total1 = sum(1, 10);
		int total2 = sum(1, 100);
		
		System.out.println("total1 : " + total1);
		System.out.println("total2 : " + total2);
		
		
		
	}	// main end
						
	// 메서드 정의, void → int, void(중요) 없다 f는 함수 int 선언 
	public static int f(int x) { // 매개변수 x, 메서드를 호출할때 x값 대입
		int y = 2 * x + 3;		
		return y; // 반환 return값의 타임을 메서드 이름앞에 선언
		
		
	}
	// 메서드 안에 메서드를 정의할 수 없다
	// 메서드 정의
	public static int sum(int start, int end) { // 매개변수도 지역변수
		
		
		// 지역변수 : 메서드 내에서 선언한 변수, 메서드 호출 스택에서 메서드가 종료되면 사라짐(해제)
		int total = 0; // 토탈 변수 선언
		
		for(int k=start ; k<=end ; k++) { // k변수는 for문에서 선언했기 때문에 for가 종료되면 해제됨
			total += k;
		}			
		// main method 위에는 갈 수 있지만 class 밖으로는 못나간다
		// push pop ??		
		return total;
		
	}	
}
