package a07_반복.quiz;

public class Quiz_08 {

	public static void main(String[] args) {
		/*
		 * 1 ~ 2001
		 * 반복을 실행
		 * 윤달이면 출력
		 * 윤달이 아니면 출력 하지 않는다
		 * 윤달의 조건 : 4의 배수 and (!(100의 배수) or (400의배수))
		 *  
		 */
		
		
		for( int i =1; i < 2002; i++) {
			if( i%4 ==0 && ( i%100 != 0 || i%400 ==0 )) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}
}


