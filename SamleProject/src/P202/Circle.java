package P202;

/*
* 날짜 : 2025/07/18
* 이름 : 이준우
* 내용 : 교재 P199 실습
* 
*/

public class Circle {
	int radius;
	public Circle(int radius) { this.radius = radius; }
	public void set(int radius) { this.radius = radius; }
	public static void main(String [] args) {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle s;
		
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.radius=" + ob1.radius);
		System.out.println("ob2.radius=" + ob2.radius);
		
	}

}
