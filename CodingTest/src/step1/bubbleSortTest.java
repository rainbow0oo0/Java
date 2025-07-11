package step1;

public class bubbleSortTest {
	
	//버블정렬 메서드
	public static void bubbleSort(int[] arr) { // 배열을 매개변수로 받아야 함
		
		int n = arr.length;
			
		// 배열 크기만큼 반복
		for (int i = 0 ; i < n - 1 ; i++) {
			
			//인접한 두 원소를 비교하여 정렬
			for (int j = 0 ; j < n - 1 - i ; j++) {
				
				if ( arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1]; // 두 원소를 바꿈
					arr[j + 1] = temp; // 두 원소를 바꿈
				
				}							
			}
		}		
	}
	
	public static void main(String[] args) {
		
		int[] data = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("정렬 전 배열:");
		for (int num : data) {	// 향상된 for문으로 배열 출력
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 버블정렬 메서드 호출
		bubbleSort(data);
		
		System.out.println("정렬 후 배열:");
		for (int num : data) {	//정렬된 배열 출력
			System.out.print(num + " ");
		}
		
	}	
}

	
