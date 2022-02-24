package a07_반복;

public class GugudanWhile {

	public static void main(String[] args) {
		int dan = 2;
		int num = 0;
		int result = 0;
		
		while(num < 9) {
			++num;
			result = dan * num;
			System.out.println(dan + " X "+ num + " = " + result);
		}
	}
}
