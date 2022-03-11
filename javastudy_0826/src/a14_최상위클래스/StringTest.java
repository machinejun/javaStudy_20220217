package a14_최상위클래스;

public class StringTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = computer1;
		Computer computer3 = new Computer();
		
		System.out.println(computer1 == computer2);
		System.out.println(computer1 == computer3);
		System.out.println(computer1.equals(computer2)); // 원래 equals는 주소값 비교이다.
		
		Integer num1 = 10; // 10 = 리터럴 상수, 어딘가에 정의되어 있고 값이 정해져 있는 상수
		int num2 = 10;
		
		System.out.println(num1+ num2);
		
		String name = "김준일"; // class 참조변수에는 주소값만 들어갈수 있다. // 김준일은 리터럴 상수이다.
		String name2 = "김준이";
		String name3 = new String("김준일");
		
		System.out.println(name3);
		
		System.out.println(name == name3);
		
		System.out.println(name == name2); // 주소값이 같아서 같다고 나온다
		System.out.println(name.equals(name3));

	}

}
