package P187;

/*
 * 날짜 : 2025/07/18
 * 이름 : 이준우
 * 내용 : 교재 P187 실습
 * 
 */


public class Circle {
	int radius;		// 원의 반지름 필드
	String name;	// 원의 이름 필드
	
	public Circle() {}
		
	public double getArea() {
		return 3.14*radius*radius;
	}	// 원의 면적 계산 메소드
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}

}
