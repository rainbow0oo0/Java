package sub2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import sub1.IOException;

/*
 *  날짜 : 2025/07/23
 *  이름 : 이준우
 *  내용 : 자바 파일 입출력 스트림 실습
 * 
 */

public class BufferStreamTest {
	
	String source = "C:\\Users\\GGG\\Decktop\\Persom.tif";
	String target = "C:\\Users\\GGG\\Decktop\\Person2.tif";
			
	try {
		// 스트림 생성(파일 연결)
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(source);
		
		// 보조 스트림(Buffer) 생성
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 무한 반복으로 스트림 작업 수행
		while(true) {
			
			// 파일 읽기
			int data = fis.read();
				
			
			if(data == -1 ) {
				// 파일 내용이 없으면
				break;
				
			}
				
		// 파일 쓰기
		// fos.write(data);
			fos.write(data);
		
		}
		fis.close();
		fos.close();
		
	
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch(IOException e) {
	e.printStackTrace();
	}
	
	System.out.println("프로그램 종료...");
	
	}		
}
}

}
