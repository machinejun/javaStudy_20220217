package a12_추상;

public  class Eagle extends Animal implements liver{
	
	@Override
	public void move() { // 추상메소드를 완성하면 다시 사용할 수 있따.
		System.out.println("독수리가 하늘을 납니다.");
		
	}
	@Override
	public void breath() {
		System.out.println("독수리는 숨을 쉽니다.");
		
	}

}
