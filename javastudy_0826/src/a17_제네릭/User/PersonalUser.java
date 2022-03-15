package a17_제네릭.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import 인터페이스연습.model.User;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class PersonalUser extends User{
	private String membershipNumber;
	
	public PersonalUser(String username, String password, String name, String email, String membershipnumber) {
		super(username, password ,name, email);
		this.membershipNumber = membershipnumber;
	}
}
