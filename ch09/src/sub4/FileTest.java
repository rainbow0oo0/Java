package sub4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  날짜 : 2025/07/23
 *  이름 : 이준우
 *  내용 : 파일 처리 실습
 * 
 */

public class FileTest {
	
	public static void main(String[] args) {
		
		
		String path1 = "C:\\Users\\GGG\\Desktop\\source.txt";
		String path2 = "C:\\Users\\GGG\\Desktop\\Sample";
		
		// 파일 객체 생성
		File file1 = new File(path1);
		File file2 = new File(path2);
		
		// 파일 작업
		try {
			file1.createNewFile(); // 파일 생성
			file2.mkdir();		   // 디렉터리 생성
			
			System.out.println("file1 존재여부 : " + file1.exists());
			System.out.println("file2 존재여부 : " + file2.exists());
			System.out.println("file1 파일 여부 : " + file1.isFile());
			System.out.println("file2 디렉터리 여부 : " + file2.isDirectory());
			System.out.println("file1 이름 " + file1.getName());
			System.out.println("file2 이름 " + file2.getName());
			System.out.println("file1 경로 " + file1.getName());
			System.out.println("file2 경로 " + file2.getName());
			System.out.println("file1 검토 " + file1.getpath());
			System.out.println("file2 검토 " + file2.getpath());
			System.out.println("file1 시스템 경로 " + file1.getAbsolutePath());
			System.out.println("file2 시스템 경로 " + file2.getAbsolutePath());
			
			file1.delete(); // 파일 삭제
			file2.delete(); // 파일 삭제
			
			// File 실습
			Path source = Paths.get(C:\\Users\\GGG\\Decktop\\source.txt);
			Path target = Paths.get(C:\\Users\\GGG\\Decktop\\source.txt);
			
			// 파일 복사
			Files.copy(source, target);
			
			//파일 이동
			Files.move(source, dest, null)
			
		} catech (IOException a) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
