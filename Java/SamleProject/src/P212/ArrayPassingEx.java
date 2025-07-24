package P212;

/*
* 날짜 : 2025/07/18
* 이름 : 이준우
* 내용 : 교재 P212 실습
* 
*/

public class ArrayPassingEx {
	static void replaceSpace(char a[]) {
		for(int i = 0; i <a.length; i++)
			if(a[i] == ' ')
				a[i] = ',';
	}
	
	static void printCharArray(char a[]) {
		for (int i = 0; i <a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
	public static void main(String args[]) {
		char c[] = {'T', 'h', 'i','s', ' ', 'a', ' ', 
				'p', 'e', 'n', 'c', 'i', 'l', '.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
