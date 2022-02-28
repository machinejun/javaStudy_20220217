package 연습;

public class Array01 {

	public static void main(String[] args) {
		/*
		 * 배열:
		 * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 * 많은 양의 데이터를 다룰 때 유용하게 사용
		 * 
		 * 선언 = 데이터_타입[] 변수명;
		 *  ex > String[] name;
		 *     > int[] score;
		 *     
		 * 생성 = 배열은 선언한다고 해서 저장할 공간이 생성되는 것이 아니라
		 *        배열을 다루는데 필요한 변수가 생성
		 *        
		 * ex > int[] a; // 배열 선언
		 *    > a = new int[3] // 배열 생성(메모리에 공간 할당)
		 *    > int[] a = new int[3] // 선언가 생성(할당)
		 * 
		 */
		
		// 배열 선언
		int[] a;
		// 배열 생성(메모리에 할당)
		a = new int[3];
		// 초기화
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		
		System.out.println(a); // 메모리 주소값
		System.out.println("배열 a = " + a[0]);
		System.out.println("배열 a = " + a[1]);
		System.out.println("배열 a = " + a[2]);
		// length 배열의 길이를 알고자 할 때
		System.out.println("배열 a의 크기는: " + a.length);
		
		//
		int i[] = {100,200,300,400};
		System.out.println("배열 a = " + i[0]);
		System.out.println("배열 a = " + i[1]);
		System.out.println("배열 a = " + i[2]);
		System.out.println("배열 a = " + i[3]);
		// length 배열의 길이를 알고자 할 때
		System.out.println("배열 a의 크기는: " + i.length);
		System.out.println("-----------------------------------");
		
		int aa[] = new int[5];  // aa = 참조변수 
		aa[0] = 90;
		aa[1] = 80;
		aa[2] = 100;
		aa[3] = 60;
		aa[4] = 50;
		
		int bb[];
		bb = aa;
		for(int k=0; k< aa.length ; k++) {
			System.out.println("aa["+k+"] = " + aa[k]);
		}
		System.out.println("----------------------");
		for(int k=0; k< bb.length ; k++) {
			System.out.println("bb["+k+"] = " + bb[k]);
		}
		
		double tt[] = new double[3];
		tt[0] = 12.1;
		tt[1] = 10.25;
		tt[2] = -1.1;
		
		double ttSum = 0;
		double ttAvg = 0;
		
		for( int j = 0; j < tt.length ; j++) {
			ttSum += tt[j];
		}
		ttAvg = ttSum/tt.length;
		System.out.println("합계: " + ttSum);
		System.out.println("평균: " + ttAvg);
		

	}

}
