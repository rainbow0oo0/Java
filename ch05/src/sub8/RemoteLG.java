package sub8;

public class RemoteLG implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("LG powerOn");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG Poweroff");
		
	}

	@Override
	public void chUp() {
		System.out.println("LG chup");
		
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LG soundUp");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LG soundDown");
		
	} // 인터페이스 구현

}
