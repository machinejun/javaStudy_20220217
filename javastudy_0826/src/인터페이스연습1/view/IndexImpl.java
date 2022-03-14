package 인터페이스연습1.view;

public class IndexImpl implements Index{
	@Override
	public void showIndex() {
		System.out.println("[확인창]");
		System.out.println("----------------------");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원조회");
		System.out.println("q. 프로그램 종료");
		
		
	}
}
