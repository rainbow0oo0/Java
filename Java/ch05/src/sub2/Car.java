package sub2;

/*
 * 날짜: 2025/07/14
 * 이름: 이준우
 * 내용: 클래스 설계(정의)
 * 
 */

public class Car {
	
	// 속성(맴버변수. 필드) - 무조건 private으로 선언
	private String name; // 캡슐화 private 은닉
	private String color; 
	private int speed;	
	
	// 생성자(Constructor) - 속성을 초기화하는 반환타입이 없고 클래스명인 메서드
	public Car(String name, String color, int speed) { // 생성자
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	} // 문법 기억하기	
	
	
	// 기능(맴버메서드) - 무조건 public 선언
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
	
	// Getter/Setter - 은닉된 속성을 안전하게 처리하기 위한 메서드	
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
	
	

}
