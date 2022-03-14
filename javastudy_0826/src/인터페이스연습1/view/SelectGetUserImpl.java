package 인터페이스연습1.view;

public class SelectGetUserImpl implements SelectGetUser{@Override
	public void show() {
	System.out.println("[회원조회]");
	System.out.println("1. 전체회원 조회");
	System.out.println("2. 아아디로 회원조회");
	System.out.println("3. 좋아요 관리");
	System.out.println("b. 돌아가기");
	
	}

}
