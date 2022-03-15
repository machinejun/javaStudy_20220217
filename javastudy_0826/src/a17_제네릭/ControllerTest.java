package a17_제네릭;


import a17_제네릭.User.CompanyUser;
import a17_제네릭.User.PersonalUser;
import 인터페이스연습.model.User;

public class ControllerTest {
	public CMRespDto<? extends User> getProfile(String username){  // 클래스 내부를 내가원하는 타입으로 바꿀수 있다. 상속받은 무언가만 받을 수 있다.
		PersonalUser personalUser = new PersonalUser("junil", "1234","김준일","j@gmail.com", "a20220001");
		CompanyUser companyUser = new CompanyUser("apple", "1234","김준일","j@gmail.com", "220-81-47821");
		if(username.equals(personalUser.getUsername())) {
			return new CMRespDto<PersonalUser>(1, "개인회원프로필",personalUser);
		}else if(username.equals(companyUser.getUsername())) {
			return new CMRespDto<CompanyUser>(1, "회사회원프로필",companyUser);
		}else {
			return new CMRespDto<User>(-1, "프로필로드 실패", new User());
		}
	}
	
	
	public CMRespDto<?> login(String username, String password){
		User userEntity = User.builder()
								.username("junil")
								.password("1234")
								.build();
		User user = new User("junil", "1234", null, null);
		// <?> 와일드카드 : 생성되는 자료형에 따라서 자료형이 달라진다.
		
		if(userEntity.getUsername().equals(username)) {
			if(userEntity.getPassword().equals(password)) {
				return new CMRespDto<User>(1, "로그인성공", userEntity);	// 생성할때 자료형은 정확하게 주어야한다.
			}else {
				return new CMRespDto<String>(-1, "비밀번호가 틀렸습니다.", password);
			}
		}else {
			return new CMRespDto<String>(-1, "아이디가 틀렸습니다.", username);
		}
		
	}
	
	public static void main(String[] args) {
		ControllerTest test = new ControllerTest();
		System.out.println(test.login("hong", "1234"));
		System.out.println(test.getProfile("junil"));
	}

}
