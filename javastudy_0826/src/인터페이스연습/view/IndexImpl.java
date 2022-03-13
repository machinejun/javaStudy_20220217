package 인터페이스연습.view;

public class IndexImpl implements Index{ //메인(목차) 페이지
	@Override
	public void show() {
		System.out.println("[회원 정보 관리 프로그램]");
		System.out.println("-------------------------");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 조회");
		System.out.println("q. 프로그램 종료");
	}
}
