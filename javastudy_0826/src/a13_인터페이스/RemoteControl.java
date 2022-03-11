package a13_인터페이스;

public class RemoteControl implements PowerButton, VolumeDownButton, VolumeUpButton{
	//implements 기능을 구현 & 장착
	
	private boolean powerFlag;
	
	@Override
	public void KeepTheUpButton() {
		// TODO Auto-generated method stub
		System.out.println("사운드를 올립니다.");
	}

	@Override
	public void KeepTheDownButton() {
		// TODO Auto-generated method stub
		System.out.println("사운드를 줄입니다.");
		
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		if(powerFlag == false) {
			System.out.println("전원을 켭니다.");
			powerFlag =true;
		}else {
			System.out.println("전원을 끕니다.");
			powerFlag = false;
		}
			
	}

	@Override
	public void sendSignal() {
		// TODO Auto-generated method stub
		System.out.println("전원신호" + powerFlag + "전송합니다.");
		
	}
	

}
