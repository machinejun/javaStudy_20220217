package a17_제네릭;

import 인터페이스연습.model.User;

public class GenericTest {

	public GenericEx<String> getExData(String data) {
		GenericEx<String> ex = new GenericEx<String>("100");
		return ex;
	} //static이 아니기에 메모리에 생성이 필요하다. ex) a08_ 5예제를 보면 static으로 설정했기에 클래스에서 공유가 가능하다.
	
	public GenericEx<User> getExData(User data) { // 정수로 보냄 or User 객체로 보냄  -> 받지 못함 
		GenericEx<User> ex = new GenericEx<User>(data);
		return ex;
	}
	
	
	public static void main(String[] args) {
		GenericTest genericTest = new GenericTest(); // 따라서 인스턴스화 시켜야지 heap메모리에 할당된다.
		GenericEx<String> ex1 = genericTest.getExData("100"); // Data 에 String 넘어감
		GenericEx<User> ex2 = genericTest.getExData(new User("junil","1234","홍길동","hong@naver.com")); // Data에 User 객체가 넘어감
		System.out.println(ex1);
		System.out.println(ex2);

	}

}
