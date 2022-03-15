package a17_제네릭.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import 인터페이스연습.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class CompanyUser extends User{
	private String businessNumber;
	
	public CompanyUser(String username, String password, String name, String email, String businessNumber) {
		super(username, password ,name, email);
		this.businessNumber = businessNumber; // 부모데이터를 받아서 생성해라
	}

	
}
