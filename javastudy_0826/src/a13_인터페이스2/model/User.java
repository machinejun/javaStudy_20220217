package a13_인터페이스2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
}
