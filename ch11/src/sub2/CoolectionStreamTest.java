package sub2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이준우
 * 내용 : 자바 컬렌션 스트림 실습하기
 * 
 */
//////////////////////////
class Person {
	private String name;
	private String age;
	
	
	public Person() {
		super();
	}	
}
////////////////////////
public class CoolectionStreamTest {

	public static void main(String[] args) {
		
		List<String> persons = new ArrayList<>();
		
		persons.add("김유신");
		persons.add("김춘추");
		persons.add("장보고");
		persons.add("강감찬");
		persons.add("이순신");
		
		// 외부 반복자를 이용한 출력
		Iterator<String> it = persons.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String person : persons) {
			System.out.println(person);
		}		
		
		// 내부 반복자를 이용한 출력
		Stream<String> stream = persons.stream();
		stream.forEach((person) -> {
			System.out.println(person);
		});
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 23));
		people.add(new Person("장보고", 23));
		people.add(new Person("강감찬", 23));
		people.add(new Person("이순신", 23));
		
		people.stream().forEach((p) -> {
			System.out.println(p);			
		});
		
		people.stream().forEach(System.out::println);
		
	}
	
}
