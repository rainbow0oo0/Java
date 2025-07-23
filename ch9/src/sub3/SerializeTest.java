package sub3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileCacheImageOutputStream;

/*
 *  날짜 : 2025/07/23
 *  이름 : 이준우
 *  내용 : 자바 파일 입출력 스트림 실습
 * 
 */

public class SerializeTest {
	
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 30000);
		
		String path = "C:\\Users\\GGG\\Decktop\\apple.data";
		
		try {
			// 식별화를 위한 기본스트림과 보조스트림 생성
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화 : 내부의 생성된 객체를 외부 파일로 내보내기
			oos.writeObject(apple);
			
			// 스트림 종료
			oos.close();
			fos.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
	}

}
