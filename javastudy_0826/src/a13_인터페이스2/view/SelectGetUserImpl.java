package a13_인터페이스2.view;

public class SelectGetUserImpl implements SelectGetUser {
	@Override
	public void show() {
		System.out.println("[회원 조회]");
		System.out.println("1. 아이디회원 조회");
		System.out.println("2. 전체회원 조회");
		System.out.println("b. 뒤로가기");
		
	}
}
