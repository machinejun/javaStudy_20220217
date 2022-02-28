package 연습;

public class Array02 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열 > 2차원 배열
		 * 
		 * 2차원 배열 선언
		 */
		
		//선언
		int a[][];
		//생성
		a = new int [2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		for(int i = 0 ; i<a.length; i++) {	
			for(int j =0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");		
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		int b [][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0 ; i<b.length; i++) {	
			for(int j =0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");		
			}
			System.out.println();
		}
	}

}
