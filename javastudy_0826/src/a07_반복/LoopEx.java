package a07_반복;

public class LoopEx {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += (++num);
			
		}
		System.out.println(result);
		
		int k = 0;                            // while 증가 된 값을 중간에 사용해야 할 때 , 내가 원하는 조건을 원하는 타이밍에 줄 수있다.
		while(k < 100) {
			System.out.println(k);
			k++;
		}
		
		for(int i = 0; i <5 ; i++) {	   // 1씩 증가 또는 정해진 규칙대로 실행되어야 할때	, for문의 변수는 지역변수{중괄호 안에 들오는 변수}이므로 바깥에서 쓸수 없지만
			for( int j =0; j <5 ; j++) {
				System.out.print("* ");
			}System.out.println();
		}
		for(int i = 0; i <5 ;) {	   // 이렇게 하면 쓸수 있다.
			i++;
			System.out.print("* ");
			}
		}
	}

