package test6;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이준우
 * 내용 : 자바 총정리 연습문제
 * 
 */

enum Gender {
	MALE, FEMALE
}
class Man {
	public void print() {
		System.out.println("남자 입니다.");
	}
}
class Woman {
	public void print() {
		System.out.println("여자 입니다.");
	}
}

public class Test09 {
	
	public static void main(String[] args) {
		
		Object human1 = makeHuman(Gender.MALE);
		Object human1 = makeHuman(Gender.FEMALE);
		
		if(human1 ?? Man) {
			Man man = (Man) humanl;
			man.print();			
		}
		
		if(human2 ?? Woman woman) {
			woman.print();
		}		
	}
	
	public static ?? makeHuman(Gender gender) {
		if(gender == Gender.MALE) {
			return new Man();
		}else if(gender == Gender.FEMALE) {
			return new Woman();
		}
		return null;
	}

}
