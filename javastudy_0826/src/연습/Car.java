package 연습;

// 클래스 : 속성 + 기능
public class Car {
	String number;
	int speed;
	String color;
	
	//////////////// 필드
	
	public void speedUp() {    // 반환 탑입이 없다.
		System.out.println("속도를 올린다.");
	}
	
	public void speedDouwn() {
		System.out.println("속도를 내린다.");
	}
	
	public static void main(String [] args) {
		int number2;
		Car myCar = new Car();  //클래스 객체화
		Car yourCar = new Car();
		
		myCar.speed = 10;
		
		System.out.println(myCar.speed);
		System.out.println(yourCar.speed);
		
	}

}
