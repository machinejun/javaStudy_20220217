package a07_반복;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if (i !=0 && i%2 ==0 ) {
				continue;                        // continue의 의미: -> 아래의 실행문을 건너 뛰고 반복문을 사용(반복을 유지)
			}
			if (i == 3) {                        // break : 반복을 끝낸다.
				break;
			}
			System.out.println(i);
		}
	}

}
