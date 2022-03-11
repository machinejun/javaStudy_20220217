package a15_lombok;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		car.setModel("테슬라모델3");
		car2.setModel("테슬라모델y");
		System.out.println(car);
		System.out.println(car.equals(car2));

	}

}
					