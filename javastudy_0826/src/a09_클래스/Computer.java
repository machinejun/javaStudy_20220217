package a09_클래스;

public class Computer {
	String model;
	
	
	public Computer() {   // 생성자 = constracter  // 자료형이 없다 -> 리턴할게 없는게 아니라 생략된 것이다 // ★★★생성자의 리턴값은 무조건 주소값이다.★★★ // 실행후 주소값 리턴
		System.out.println("컴퓨터 객체를 생성합니다.");
	
	}
	
	public void printInfo( ) {
		System.out.println("컴퓨터 모델: " + model);
	}
}
