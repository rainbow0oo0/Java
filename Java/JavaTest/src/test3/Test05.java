package test3;

/*
 * 날짜 : 2025/07/16
 * 이름 : 이준우 
 * 내용 : 싱글톤 연습문제
 */

class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void info() {
		System.out.println("-----------------");
		System.out.println("차량명 : "+name);
		System.out.println("가  격 : "+price);
		System.out.println("-----------------");
	}
}

class CarFactory {
	// 싱글톤
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;		
	}
	public Vehicle createCar(String name, int price){
		return new Vehicle(name, price);
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factroy = CarFactory.getInstance();
		
		Vehicle avante = factroy.createCar("아반테", 2500);
		Vehicle sonata = factroy.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();		
	}
}
