package P189;

/*
 * 날짜 : 2025/07/18
 * 이름 : 이준우
 * 내용 : 교재 P189 실습
 * 
 */

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();			
		
	}	
}
