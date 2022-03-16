package a18_컬랙션;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.NonFinal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student {
	/*
	 * studentname
	 * studentemail
	 * studentAddress
	 */
	
	private String name;
	private String email;
	private String address;
	
}
