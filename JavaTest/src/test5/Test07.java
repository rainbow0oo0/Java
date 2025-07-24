<<<<<<< HEAD
package test5;

public class Test07 {

}
=======
package test5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이준우
 * 내용 : 로또번호 연습문제 
 *  
 */

public class Test07 {
	public static void main(String[] args) {
		
		for(int count=1 ; count <=5 ; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random() * 46);
				
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		// 정렬을 위해 TreeSet 사용
		Set<Integer> treeSet = new TreeSet<>(lottoSet);		
		
		return treeSet;
	}
}
>>>>>>> 5b81681 (추가)
