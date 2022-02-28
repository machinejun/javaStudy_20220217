package a08_함수;

public class MethondEx1 {  // 메소드는 똑같은 이름, 똑같은 매개변수로는 설정할 수는 없음 
	
	public static int outputNumber() {  // 리턴값이 있지만 , 매개변수 없는 형태
		return 10;
	}
	
	public static void showName() {   // return 타입이 있으면 값이 있다는 것, void 값이 없으므로 단순하게 실행되는 용도
		String name = "홍길동";
		System.out.println("이름: " + name);
	}
	
	public static int outputNumber2(int number) {   // 매개변수 선언 , 리턴 자료형 O , 매개변수 O
		return number;
		
	}
	
	public static int outputNumber3(int number) {
		if(number % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void showName2(String name) {
		if( name == null) {
			 return;   // 함수 기능 멈춤
		}
		System.out.println(name);
	}

	public static void main(String[] args) {   // 프로그램 시작점
		int number = outputNumber();
		System.out.println(number);
		showName();
		showName2("박사");
		int number2 = outputNumber2(100);   // 100이 outputnumber2 메소의 매개변수에 들어감
		System.out.println(number2);
		System.out.println(outputNumber3(10));
		
	}
}
