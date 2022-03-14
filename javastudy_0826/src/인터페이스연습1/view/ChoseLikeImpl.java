package 인터페이스연습1.view;

public class ChoseLikeImpl implements ChoseLike {
	
	@Override
	public void show() {
		System.out.println("[좋아요 관리]");
		System.out.println("1. 좋아요 +1");
		System.out.println("2. 좋아요 -1");
		System.out.println("3. 좋아요 조회");
		System.out.println("b. 돌아가기");
	}

}
