package a15_lombok;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Iphone {
	private int series;
	private String model;
	private String color;
	private int memorySize;
	private int releaseYear; // localDateTime :
	
	

}
