package P266;

/*
* 날짜 : 2025/07/18
* 이름 : 이준우
* 내용 : 교재 P266 실습
* 
*/

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}	
}

class Stundent extends Person{
	public void set() {
	age = 30;
	name = "홍길동";
	height = 175;
	// weight = 99;
	setWeight(99);		
	}	
}

public class InheritancEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
