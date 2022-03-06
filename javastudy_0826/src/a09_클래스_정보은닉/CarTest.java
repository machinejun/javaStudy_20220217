package a09_클래스_정보은닉;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		c.setModel("k5"); // set -> 메소드(매개변수) 모양으로 변수에 값을 선언 한다.
		
		String CompanyAndModel = "기아자동차" + c.getModel() + "차량";//get -> 값을 가져올때 변수명.getter()를 사용한다.
		System.out.println(CompanyAndModel);

	}

}
