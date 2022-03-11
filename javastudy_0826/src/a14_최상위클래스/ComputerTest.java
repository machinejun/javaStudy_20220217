package a14_최상위클래스;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
//		computer                      // computer. 
		Computer laptop = new Laptop("삼성","캘럭시북 프로");
		Object obj = new Computer();
		Object obj2 = new Laptop("LG","그램");
		Computer c = (Computer)obj;
		Object[] c1 = new Computer[2];
		System.out.println(computer);
		System.out.println(laptop);
		System.out.println(obj2);
		
		((Computer)obj).computerTest();
		
	}

}
