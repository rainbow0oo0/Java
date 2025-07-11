package test1;

/*
 * 날짜 : 2025/07/09
 * 이름 : 이준우 
 * 내용 : 자바 기본 입출력 연습문제
 */

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("점수 입력: ");
	        int score = sc.nextInt();	        
	        char grade = 0; // char 문자 등급을 저장할 변수

	        System.out.println("입력한 점수는 " +score+ "입니다.");

	        if (score >= 90 && score <=100) {
	            grade = 'A';
	        } else if (score >= 80 && score < 90) {
	            grade = 'B';
	        } else if (score >= 70 && score < 80) {
	            grade = 'C';
	        } else if (score >= 60 && score < 70) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        System.out.printf("등급은 %c입니다.", grade);
	    }
	}
