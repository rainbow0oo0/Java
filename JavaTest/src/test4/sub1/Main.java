package test4.sub1;

/*
 * 날짜 : 2025/07/17
 * 이름 : 이준우
 * 내용 : 자바 클래스 문제
 * 
 * 정정
 * 문제2. 출력결과 "키보드 15개 재고 추가 됨" -> 15개x -> 5개
 */

public class Main {	
	
	public static void main(String[] args) {	
		
		StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);
		
		student.printStudentInfo();
		System.out.println("-----------------------");
		
		student.updateScore(98.0);
		System.out.println("-----------------------");
		
		student.updateScore(102.0);
		System.out.println("-----------------------");
		
		student.printStudentInfo();
		System.out.println("-----------------------");		
		
	}
}
