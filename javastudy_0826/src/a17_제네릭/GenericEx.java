package a17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class GenericEx<T> { // T = type(자료형)  -> generic : 자료형을 변환한다.
	private T data;
	

}
