package sub6;

/*
 * 날짜 : 2025/07/15
 * 이름 : 이준우
 * 내용 : 다향성 실습하기
 * 
 * 다향성(Polymoerphism)
 * - 상속관계에서 부모클래스의 기능이 지식클래스에서 다양한 형태로 변하는 특징
 * - 객체 생성할때 타입선언을 부모클래스 타입으로 선언(업캐스팅)
 * - 다형성을 통해서 프로그래밍 중복코드 줄이고 유연성 향상
 * 
 * 날짜 : 2025/07/16
 * 이름 : 이준우
 * 내용 : Pet(Cat, Dog) 상속 연습
 * 
 */

public class PolyTest {
	public static void main(String[] args) {
		
		// 다향성 실습 - 자식 객체의 타입선언을 부모타입으로 선언
		Animal tiger = new Tiger(); // 업캐스팅
		Animal eagle = new Eagle(); // 업캐스팅
		Animal shark = new Shark(); // 업캐스팅
		
		// 적극적인 문법활용 Animal 통일
		
		tiger.move();
		tiger.hunt();
		
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 다운캐스팅 - 부모타입의 객체를 자식타입으로 캐스팅(Casting, 형변환)
		Tiger t = (Tiger) tiger;
		Eagle e = (Eagle) eagle;
		Shark s = (Shark) shark;
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		// 다향성을 활용한 객체 배열
		Animal arr[] = {t, e, s};
		// arr[] 앞 Tiger, Eagle, Shark를 넣으면 작동x
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		//////////////////////////////////////////////////
		
		Dog dog = new Dog();
		Cat cat = new Cat();	
		
		printSound(dog);
		printSound(cat);
				
	}	
	public static void printSound( Pet pet ) {
		pet.makeSound();		
		
	}
}
