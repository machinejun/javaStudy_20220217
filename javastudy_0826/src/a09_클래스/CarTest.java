package a09_클래스;

public class CarTest {

	public static void main(String[] args) {
		// Car c2;  -- 변수 선언(Car 참조 자료형) : Car를 담을 수 있는 공간
		// 참조 자료형 = 주소값을 가짐
		// String str = "김준일"; 주소값을 가짐,
		// new Car();  // Car 객체 생성 -> 힙메모리 영역에 Car 클래스 사이즈만큼 메모리를 빌려서 할당
		// ex> 10002588
		// c2 = new Car(); 주소를 변수에 담는다.
		// c2. 그래서 이제 Car 클래스의 변수, 메소드에 접근할 수 있다.
		
		
		
		
		
		/*
		 *  Car 클래스 정의
		 *  
		 *  속성(변수)------
		 *  1. model
		 *  2. company
		 *  3. oil
		 *  
		 *  메소드(void) -------
		 *  void go()  ->
		 *  기름 - 1;
		 *  기름이 1 감소하였습니다.
		 *   
		 *  void oiling()  ->
		 *  기름 + 1;
		 *  기름이 1 증가하였습니다.
		 *  
		 *  void showCarInfo() ->
		 *  ooo에서 제조한 ooo차량의 정보입니다.
		 *  현재 기름은 oooL 입니다.
		 *  
		 *  oil = 5
		 *  go();
		 *  기름이 0보다 적으면 -> 기름이 부족합니다. 차량의 이동이 불가합니다.
		 *  
		 */
		
		Car car1 = new Car();
		car1.model = "소나타";
		car1.company = "현대";
		car1.oil = 5;
		
		Car car2 = new Car();
		car2.model = "k5";
		car2.company = "기아";
		car2.oil = 5;
		
		System.out.println(car1.model);
		
		car1.showCarInfo();
//		car1.go();
//		car1.go();
//		car1.go();
//		car1.go();
//		car1.go();
//		car1.go();
//		car1.go();
//		car1.oiling();
//		car1.showCarInfo();
		// car1.oilError(); private로 설정하여서 외부에서 쓸수 없다.
		System.out.println(car2.company);
		car2.showCarInfo();
//		car2.go();
//		car2.oiling();
//		car2.oiling();
//		car2.oiling();
//		car2.oiling();
//		car2.oiling();
//		car2.oiling();
//		car2.showCarInfo();
		
	}

}
