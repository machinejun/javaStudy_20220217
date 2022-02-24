package a07_반복;

public class Gugudanfor {

	public static void main(String[] args) {
		int dan = 2;
		for(int i = 0 ; i < 9; i++) {
			int num = i+1;
			System.out.println(dan + "X" + num + "=" + (dan*num));
		}
		
		for(int i = 0, j =0 ; i < 9; i++, j++) {
			int num = ++i;
			System.out.println(dan + "X" + num + "=" + (dan*num));
		}
	}

}
