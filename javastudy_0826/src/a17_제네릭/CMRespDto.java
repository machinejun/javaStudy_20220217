package a17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CMRespDto<T> {//전달하는 자료형이 바뀔때
	/*
	 *  ☆ DAO       : for 데이터에 접근하기 위한 = 요청에 관련된 로직
	 *    		      DB에 접근하기 위해서 사용되는 로직, 
	 *    DTO(객체) : for 데이터 변환 = 데이터 교환
	 *                DB에서 가져온 데이터를 java에서 사용할수 있도록 변환 or java에 객체들을 DB에서 사용할 수 있도록 변환
	 *                ex) 웹에서 텍스트 입력, 이미지 추가, 파일 추가 등을 저장할 때 -> 서버로 저장 요청 -> 웹에서 사용되는 데이터를 변환해서 서버에 요청(request DTO)
	 *                    반대가 되면 (response DTO)
	 *    제네릭 : 클래스<>
	 *                    
	 */ 
	
	
	private int code; // 1(성공), -1(실패)
	private String message;
	private T data;
	
}
