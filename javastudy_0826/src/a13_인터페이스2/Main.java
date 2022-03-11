package a13_인터페이스2;
/*
 * MVC- 모델이랑 뷰랑 조합하여서 화면에 보여주는 방식
 * 
 * 
 */

import java.util.Scanner;
import a13_인터페이스2.controller.PageController;
import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;
import a13_인터페이스2.service.UserServiceImpl;
import a13_인터페이스2.view.IndexImpl;
import a13_인터페이스2.view.InputImpl;

public class Main {

	public static void main(String[] args) { // pagecontroller 생성( 매개변수로 주소값 2개 전달)
		Scanner scanner = new Scanner(System.in); //입력을 위해서 스캐너 객체 생성
		UserData userData = new UserData(); //회원정보(User객체)를 저장하고 공유하기 위해 생성 -> User[] 
		System.out.println("관리할 회원의 수를 입력해주세요: "); 
		userData.setUsers(new User[scanner.nextInt()]); // User[크기 = 회원수] 입력받는다. 크기지정 & 생성된 배열을 UserData 객체의 users 배열 변수에 set하는 것
		scanner.nextLine(); // 위의 nextInt()후에 버퍼에 저장된 엔터 날려주기
		
		PageController controller = new PageController( new InputImpl(), new UserServiceImpl(userData)); //다른 패키지에 들어있기 때문에 import해 주어야한다. 동일패키지 이면 import 해줄 필요가 없다
		//PageController 객체 안의 index()메서드를 실행하기 위해 생성. 
		controller.index();
	}

}
