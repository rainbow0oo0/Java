package sub5;

/*
 * 날짜 : 2025/07/08
 * 이름 : 이준우 
 * 내용 : 삽입 정렬 알고리즘 실습하기
 */

import java.util.Scanner;

public class BinarySearchTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5,  10, 18, 22, 35, 55, 75, 103, 152}; // 75
		
		System.out.print("검색할 값 입력 : ");		
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length - 1; // 8
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2; // 4
			
			if(arr[mid] > value) {				
				end = mid - 1;
						
			} else if(arr[mid] < value) { // mid 35 value 75				
				start = mid + 1;
						
			} else {
				loc = mid;
				state = true;
				break;				
			}			
		}
		// 5(start) 10 18 22 35(mid) 55 75 103 152(end)
		// 알고리즘은 이해를 해야한다		
		if(state) {
			System.out.printf("%d번째 있습니다.", loc + 1);
		} else {
			System.out.printf("찾는 숫자 없음");
		}
		
		sc.close();
	}

}
