package a03_연산자;

public class Operation04 {
	
	
	 /* 논리연산자(boolean 
	  * : AND = && -> 곱
	  * : OR = || -> 합
	  * : NOT = ! ->  부정
	  *  true = 1 , false = 0
	  * 
	  * <AND>
	  *  true&&true => true
	  *  true&&false => false
	  *  
	  * <OR>
	  *  true || true => true
	  *  true || false => true
	  *  false || false => false
	  *  
	  *  <NOT>
	  *  !true => false
	  *  !(true || false) => false
	  *  !true || false => false
	  *  
	  */

	public static void main(String[] args) {
		
		boolean result, result1;
		int score = -1;
		
		result = score > -1 && score < 101 ;
		
		System.out.println("결과: "+ result);
		
		char grade = 'A';
		char grade1= 'B';
		// grade 소문자여도 되고 대문자여도 되는데 a,b,c 가 되는데 나머지가 들어오면 다 false
		
		result1 = (grade1 > 64 && grade1 < 68) || (grade1 > 96 && grade1 < 100) ;
		result = ( grade == 'a' || grade == 'b' || grade == 'c' || grade =='A' || grade =='B' || grade=='C');
		System.out.println("결과: " + result);
		System.out.println("결과: " + result1);
		
		int Score = 20;
		char Grade = Score > -1 && Score < 101 ? 
				Score > 89 ? 'A':
					Score > 79 ?'B' :
						Score > 69 ? 'C' :
							Score > 59 ? 'D' :
								Score > 0 ? 'F' : 'X' 
												:'X';
		System.out.println(Grade);
		
		
		
		
		
	}

}
