package test3;

/*
 * 날짜 : 2025/07/16
 * 이름 : 이준우 
 * 내용 : 클래스 연습문제
 */

class Car {
	private String brand; 
	private String name;
	private int price;
	
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void drive() {
		System.out.println(name+" 운행 중...");
	}
	
	public void info() {
		System.out.println("제조사 : " + brand);
		System.out.println("제조사 : " + name);
		System.out.println("제조사 : " + price);
	}

}

public class Test03 {
	public static void main(String[] args) {
		
		Car sonata = null;
		Car k5 = null;
		
		sonata = new Car("현대", "소나타", 3000);
		k5	   = new Car("기아", "K5", 4000);
				
		sonata.drive();
		sonata.info();
		
		k5.drive();
		k5.info();		
		
	}
}
