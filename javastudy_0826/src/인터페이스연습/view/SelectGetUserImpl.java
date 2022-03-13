package 인터페이스연습.view;

public class SelectGetUserImpl implements SelectGetUser{
	@Override
	public void show() {
		System.out.println("[회원 조회]");
		System.out.println("1. 전체 회원 조회");
		System.out.println("2. 아이드로 회원 조회");
		System.out.println("b. 뒤로가기");
	}
	
}
