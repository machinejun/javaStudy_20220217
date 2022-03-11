package a12_추상;

public class AnonymousClass {
	/*
	 * 클래스가 재 사용하지 않을 때 한번만 쓰고 버릴때  -> 설문페이즈 등등 임시적으로 한번만 사용하면 되는 클래스를 생성할 때 
	 * 
	 */

	public static void main(String[] args) {
		
		Animal animal1 = new Animal() /* 클래스명 */ {
			@Override
			public void move() {
				System.out.println("토끼가 뜁니다.");
			} // 임시로 1번만 구현
			
			
			
		}// 클래스 정의
		;// 대입연산자
		
		Animal animal2 = new Animal() /* 클래스명 */ {
			@Override
			public void move() {
				System.out.println("강아지가 뜁니다.");
			} // 임시로 1번만 구현
			
			
			
		}// 클래스 정의
		;//
		
		animal1.move();
		animal2.move();
	}

}
