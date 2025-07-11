package sub4;

import java.util.Arrays;

/*
 * 날짜 : 2025/07/08
 * 이름 : 이준우 
 * 내용 : 삽입 정렬 알고리즘 실습하기
 */

public class InsertionSortTest {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 1, 5, 3};
		
		for(int i=1 ; i < arr.length ; i++) {
			
			int key = arr[i]; // 기준값
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				j--;
				
			}		
			
			arr[j+1] = key;
			
			System.out.println(Arrays.toString(arr));
			
			// 성능이 가장 정렬 : 퀵 정렬
			// 이진 탐색 : 정렬된 데이터 집합을 반으로 쪼개가면서 탐색하는 방법
		}		
		
		
	}
	
}
