package a11_상속;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
		Test1[] t1Array = new Test1[10];
		t1Array[0] = test1;
//		t1Array[0] = test2; // 자식끼리는 참조자료형이 다르기 때문에 넣을 수 없다.
//		
		//오버 업캐스트: 자식이 부모 객체로 변하는 것
		Test t1 = test1;
		Test t2 = test2;
		Test[] tArray = new Test[2];
		tArray[0] = test1;
		tArray[1] = test2;
		
		// 부모 -> 자식 : 다운 캐스팅
		Test1 tt1 = (Test1)t1;
		Test2 tt2 = (Test2)t2;
		
		// 잘못된 다운캐스팅1
		Test ttt = new Test();
		Test1 ttt1 = (Test1)ttt;
		
		// 잘못된 다운캐스팅2
		Test tttt1 = new Test1();
		Test tttt = tttt1;
		Test2 tttt2 = (Test2)tttt;
	}

}
