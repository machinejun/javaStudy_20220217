package a09_클래스;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = null;
		Computer c2 = null;
		
		
		c1 = new Computer(); //생성 or 생성자 호출 // 메소드 , 메소드는 소문자로 시작하지만   // c1이라는 곳에 주소값이 들어간다.
		c2 = new Computer();
		
		System.out.println(c1); // > a09_클래스.Computer@5aaa6d82
		System.out.println(c2); // > a09_클래스.Computer@73a28541, 주소값 다름
		// a09_클래스.Computer@5aaa6d82 // ___.___(주소)@____(메모리 값) // 프로그램 -> 스택(컴파일 되는 순간 지정된 크기, 정적 영역) , but 생성자 -> 힙(늘어났다 줄어들었다 할수 있는 동적 영역)
		// ex> sc.next()  > . = 참조
		
		c1.model = "삼성컴퓨터";
		c2.model = "LG컴퓨터";
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		// why 클래스를 쓰냐? :
		/*
		 * String model = "삼성컴퓨터";
		 * String model1 = "삼성컴퓨터";
		 * String model2 = "삼성컴퓨터";
		 * String model3 = "삼성컴퓨터";
		 * String model4 = "삼성컴퓨터";
		 * String model5 = "삼성컴퓨터";
		 * String model6 = "삼성컴퓨터";
		 * String model7 = "삼성컴퓨터";   > 이따구 사용하지 않기 위해서 / 변수(속성)은 같지만 주소와 속성값만 다르다 / 제품의 일련번호 = 주소값이라고 생각하면 편하다
		 * 
		 * 
		 */
		c1.printInfo();
		c2.printInfo();
	}

}
