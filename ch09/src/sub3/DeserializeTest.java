package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 *  날짜 : 2025/07/23
 *  이름 : 이준우
 *  내용 : 역질렬화(Deserialize) 실습
 * 
 */

public class DeserializeTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";
		
		try {
			// 역질렬화를 위한 기본스트림과 보조스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//역직렬화 : 
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			// 스트림 종료
			ois.close();
			fis.close();
			
		}catch (Exception e) {
			e.printStackTrace("프로그램 종료...");		
			
		}
		
		
	}
}
