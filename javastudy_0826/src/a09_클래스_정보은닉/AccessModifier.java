package a09_클래스_정보은닉;

/**
 *  접근 지정자(AccessModifier)
 *  1. default -> 클래스가 위치하고 있는 패키지 내부(같은 패키지)
 *  2. protected -> 동일 패키지 클래스(default와 같음) + 해당 클래스에서 상속받은 클래스
 *  3. public -> 모든 위치에서 접근 가능하다.
 *  4. private -> 본인 클래스 내부에서만 접근이 가능
 *  
 *  
 * 
 */

public class AccessModifier {
	String name;
	protected int age;
	public String phone;
	private String address;

}

