package a09_클래스;

public class CarTest {

	public static void main(String[] args) {
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
		
		car1.showCarInfo();
		car1.go();
		car1.go();
		car1.go();
		car1.go();
		car1.go();
		car1.go();
		car1.go();
		car1.oiling();
		car1.showCarInfo();
		// car1.oilError(); private로 설정하여서 외부에서 쓸수 없다.
		
		car2.showCarInfo();
		car2.go();
		car2.oiling();
		car2.oiling();
		car2.oiling();
		car2.oiling();
		car2.oiling();
		car2.oiling();
		car2.showCarInfo();
		
	}

}
