package a09_클래스;

/**
 * 
 * 속성
 * phoneType 1 -> 피쳐
 * phoneModel
 * phoneColor
 * 
 * 기능 
 * powerOn -> 
 * phoneModel의 전원을 킵니다.
 * powerOff ->
 * phoneModel의 전원을 끕니다.
 * 
 * 휴대폰 타입: feature-phone, smart-phone
 * 휴대폰 모델: 롤리팝,고아라폰, 아이폰, 갤럭시
 * 휴대폰 색상: black, white, blue, red
 */

public class Phone {
	private int phoneType;
	private String phoneModel;
	private int phoneColor;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Phone(int phoneType, String phoneModel, int phoneColor) {
		super();
		this.phoneType = phoneType;
		this.phoneModel = phoneModel;
		this.phoneColor = phoneColor;
	}
	
	// 기본생성자
	// 전체생성자



	public int getPhoneType() {
		return phoneType;
	}



	public void setPhoneType(int phoneType) {
		this.phoneType = phoneType;
	}



	public String getPhoneModel() {
		return phoneModel;
	}



	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}



	public int getPhoneColor() {
		return phoneColor;
	}



	public void setPhoneColor(int phoneColor) {
		this.phoneColor = phoneColor;
	}



	public void powerOn() {
		System.out.println(this.phoneModel + "의 전원을 켭니다.");
		
	}
	
	public void powerOff() {
		System.out.println(this.phoneModel + "의 전원을 끕니다.");
	}
	
	public void showInfo() {
		if( this.phoneType == 1) {
			System.out.println("feature-phone");
		}else {
			System.out.println("smart-phone");
		}
		System.out.println(this.phoneModel);
		if( this.phoneColor == 1) {
			System.out.println("black");
		}else if( this.phoneColor == 2) {
			System.out.println("white");
		}else if ( this.phoneColor == 3) {
			System.out.println("blue");
		}else {
			System.out.println("rainbow");
		}
		
	
		
		
	}
	
	

}
