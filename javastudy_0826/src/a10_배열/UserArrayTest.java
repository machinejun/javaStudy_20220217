package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];  // User 객체들을 묶어주겠다 , 주소값이 들어간다.
		
		users[0] = new User("junil","1234"); // 안에 속성 메소드 들이 들어가있다.
		users[1] = new User("junil1","1234"); // 안에 속성 메소드 들이 들어가있다.
		users[2] = new User("junil2","1234"); // 안에 속성 메소드 들이 들어가있다.
		users[3] = new User("junil3","1234"); // 안에 속성 메소드 들이 들어가있다.
		users[4] = new User("junil4","1234"); // 안에 속성 메소드 들이 들어가있다.
		
		for(int i =0; i<users.length;i++) {
				
//			if(users[i] !=null ) {   
//			users[i].showInfo();
//			}
//		}
			
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
			
			
		// null 이라는 주소로써의 0이다. 주소 0으로가면 값이 아무것도 없다.
		// String도 객체이기 때문에 null을 사용한다.
		System.out.println("------------------------------------------");
		int[] numbers = new int[5]; //인트 자료들을 묶어주겠다
		
		for(int i =0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		// 0 이라는 의미는 
		
	}

}
