package sub3;

import java.util.Arrays;

/*
 * 날짜 : 2025/07/08
 * 이름 : 이준우 
 * 내용 : 선택 정렬 알고리즘 실습하기
 */

public class SelectionSortTest {
	
	public static void main(String[] args) {		
		
		int arr[] = {4, 2, 1, 5, 3};
		
		for(int i=0 ; i<4 ; i++) {
			
			for(int j = i+1 ; j<5 ; j++) {
				
				if(arr[i] > arr [j]) {
					
					int temp = arr[j];					
					arr[j] = arr[i];							
					arr[i] = temp;
					
				}				
				// System.out.println(Arrays.toString(arr));
				// [2, 4, 1, 5, 3]
				// [1, 4, 2, 5, 3]
				// [1, 4, 2, 5, 3]
				// [1, 4, 2, 5, 3]
		     	// [1, 2, 4, 5, 3]
				// [1, 2, 4, 5, 3]
				// [1, 2, 4, 5, 3]
				// [1, 2, 4, 5, 3]
				// [1, 2, 3, 5, 4]
				// [1, 2, 3, 4, 5]			
			}		
		}		
		
		// 정렬된 배열 출력하기
		for(int n : arr) {
			System.out.print(n + " " );
		}				
	}

}
