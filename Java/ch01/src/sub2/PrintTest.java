package sub2;

/*
 * 날짜 : 2025/07/07
 * 이름 : 이준우 
 * 내용 : Java 다양한 출력 실습하기
 */

public class PrintTest {
	
	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java!"); // 한줄 복사 : Ctrl + Alt 방향키 아래(위)
		System.out.println("Hello Java!"); // 한줄 삭제 : Ctrl + d		
		System.out.println("Hello Java!"); // 작업 취소 : Ctrl + z
		
		// 한줄 출력
		System.out.print("Welcome"); // ln(줄바꿈) 처리가 안되기 때문에 그 다음 출력문이 바로 이어서 출력됨
		System.out.print("Java!");
		
		// 개행 출력
		System.out.println(); // 줄바꿈
		System.out.print("Welcom\n"); // \n : 개행처리 이스케이프 특수문자
		System.out.print("Korea!");
		
		// 개인 연습
		System.out.println("Hello Java");
		System.out.print("Hello");
		System.out.print("Java");
		
	}

}
