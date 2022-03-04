package a11_상속;

public class Eagle extends Animal{
	
//	@Override  // 어노테이션 : 부모의 메서드를 자식대에서 재정의 했다라는 표기 / why 사용 ? : 부모의 메서드를 새로운 메서드로 재 정의해서 사용하고 싶을 때 
//	public void move() {
//		super.move(); // super : 부모의 주소  -(바꿔줌)-> System.out.println("독수리가 하늘을 납니다.");  ->  자식의 정의가 실행된다.
//	}
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘로 날아 올라갑니다.");
	}

}
