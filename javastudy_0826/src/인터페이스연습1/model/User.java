package 인터페이스연습1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
	private String userName;
	private String password;
	private String name;
	private int like = 0;
	
}
