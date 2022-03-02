package a09_클래스;

public class Car {
	String model;
	String company;
	int oil;
	
	public void go() {
		if( oil < 1) {
			oilError();
		}else {
			oil--;
			System.out.println("기름이 1 감소하였습니다.");
			System.out.println();
		}
	}
	
	public void oiling() {
		oil++;
		System.out.println("기름이 1 증가하였습니다.");
		System.out.println();
	}
	
	public void showCarInfo() {
		System.out.println(company + " 회사에서 제조한 " + model + " 차량의 정보입니다.");
		System.out.println("현재 기름은 " + oil+ "L 입니다.");
		System.out.println();
	}
	
	private void oilError() {
		System.out.println("기름이 0이하이면 기름이 부족하여 차량 이동이 불가합니다.");
		System.out.println("현재 기름: " + oil);
		System.out.println();
	}

}
