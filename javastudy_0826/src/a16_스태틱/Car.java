package a16_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 스태틱(static)이란?
 * 해당 클래스 내에서 한번 선언되면 계속 공유되는 영역
 * 
 * static 변수 
 * & static 메소드
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
	private int serialNumber;
	private String company;
	private String model;
	}
	

