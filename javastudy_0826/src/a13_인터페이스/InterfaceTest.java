package a13_인터페이스;
/**
 * 인터페이스 = 규격, 약속
 * 인터페이스는 다중 구현이 가능하다.
 * 클래스는 다중 상속이 불가능하다.
 * 
 *
 */

public class InterfaceTest { // 연결을 위한 형태
	

	public static void main(String[] args) {
		PowerButton button = new RemoteControl();
		PowerButton button2 = new MonitorControl();
		
		button.onClick();
		button.sendSignal();
		button2.onClick();
		button2.sendSignal();
		
		PowerButton[] buttons = new PowerButton[2];
		buttons[0] = button;
		buttons[1] = button2;
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i].onClick();
			buttons[i].sendSignal();
		
		}
		
		

	}

}
