package a11_상속;

public class Test1 extends Test {
	public Test1() {
		super("a");  //  생략되어 있다. 부모가 생성된 후에 자식요소를 실행 할 수 있기에 super()가 아래로 내려갈 수 없다.
		System.out.println("자식 1번 클래스 생성");
	}
	
	

}
