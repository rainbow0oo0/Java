package sub1;

public class Apple extends Object { // 자바의 모든 클래스는 암묵적으로 Object를 상속

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	} // 마우스 우클릭 + Source + 뭐시기	
	
	
}
