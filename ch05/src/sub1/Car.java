package sub1;

/*
 * 날짜: 2025/07/14
 * 이름: 이준우
 * 내용: 클래스 설계(정의)
 * 
 */

public class Car {
	
	// 속성(맴버변수. 필드)
	String name;
	String color;
	int speed;	
	
	// 기능(맴버메서드)
	public void speedUp(int speed) {
		
		// this는 자기 참조 키워드, 클래스의 맴버변수 참조
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		
		this.speed -= speed;	
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량명 : " + color); //this 생략
		System.out.println("차량명 : " + speed); //this 생략
		
	}
	
	

}
