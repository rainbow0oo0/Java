package P216;

/*
* 날짜 : 2025/07/18
* 이름 : 이준우
* 내용 : 교재 P216 실습
* 
*/


public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;		
		
		System.gc(); // 가비지 컬렉션 강제 요청
		
	}
} // ?

