package sub1;

/*
 * 날짜: 2025/07/14
 * 이름: 이준우
 * 내용: 클래스 설계(정의)
 * 
 */

public class Account {
	
	// 속성
	public String bank;
	public String id;
	public String name;
	public int balance;
	
	//기능
	public void deposit(int money) {
		
		this.balance += money;		
	}
	
	public void withdraw(int money) {
		
		this.balance -= money;		
	}
	
	public void show() {
		System.out.println("------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("------------------");
		
		
		
	}	

}
