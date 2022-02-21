package a03_연산자;

public class Operation01 {

	public static void main(String[] args) {
		int score = 10;
		//score += 1;
		//score++; > 증강연산자
		//--score; > 증감연산자
/*
 *  ++score : 선 증가 > 
 *  score++ : 후 증가 > 
 * 
 */
		
		System.out.println(score++);   // 10 출력
		System.out.println(score);     // 다음번 사용되면 11 출력
		System.out.println(--score);

	}

}
