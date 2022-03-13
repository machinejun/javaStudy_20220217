package a16_스태틱;

import java.time.LocalDate;

public class KIA {
	private static KIA instance;
	private String companyName;
	private int serialNumber;
	
	
	private KIA() {
		companyName = getClass().getSimpleName(); // getName (패키지 + 클래스 이름 가져옴) , getSimpleName( 클래스 이름만 가져옴)
		serialNumber = LocalDate.now().getYear()* 10000; // 년도(,날짜,시간) 가져오기
	}
	
	public static KIA getInstance() {
		if(instance == null) { // 이거 빼먹으면 새로 생성할때마다 이전 값을 날리고 새로 대입한다.
		instance = new KIA();
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(++serialNumber, companyName, model);
	}
	
}
