package sub4;

/*
 * 날짜 : 2025/07/15
 * 이름 : 이준우
 * 내용 : 다음 요구사항을 만족하는 자바 프로그램을 작성하시오.
 * 
 */

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("Person is working");
	}
	
	public void introduce() {
		System.out.println("이름은 ["+name+"]이고, 나이는 ["+age+"]세 입니다.");
	}
}
