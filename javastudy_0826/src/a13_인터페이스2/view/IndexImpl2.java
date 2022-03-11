package a13_인터페이스2.view;

public class IndexImpl2 implements Index{       //index를 implements 하겠다 -> 추상메서드를 완성해야지 빨간줄이 사라진다@Override
	
	public void show() {
		System.out.println("[회원 정보 관리프로그램]");
	}
}
