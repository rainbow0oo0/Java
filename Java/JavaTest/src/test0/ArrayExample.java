package test0;

/*
 * 날짜 : 2025/07/10
 * 이름 : 이준우
 * 내용 : 배열 연습
 * 
 */

public class ArrayExample {
	
	public static void main(String[] args) {
		
		// int형(정수형) 배열 선언과 초기화
        int[] arr = {10, 20, 30, 40, 50};
        
        // 배열의 첫 번째 요소 출력 (인덱스는 0부터 시작)
        System.out.println("첫 번째 값: " + arr[0] + " A ");  // 10
        
        // 배열의 모든 값 출력
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("arr[" + i + "] = " + arr[i] + " ");		
        }
        
	}
    
}


