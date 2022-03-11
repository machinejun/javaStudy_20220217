package a13_인터페이스2.view;

public class IndexImpl implements Index{       //index를 implements 하겠다 -> 추상메서드를 완성해야지 빨간줄이 사라진다@Override
	
	public void show() { // 상속된 Index 추상메서드 완성
		
		System.out.println("[회원 정보 관리프로그램]");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원조회");
		System.out.println("q. 프로그램 종료");
	}
}
