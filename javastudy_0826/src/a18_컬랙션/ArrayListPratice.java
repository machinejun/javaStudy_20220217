package a18_컬랙션;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListPratice {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		System.out.println(numbers);
		
		numbers.add(1, 80);
		System.out.println(numbers);
		System.out.println(numbers.indexOf(30));
		
		Iterator it = numbers.iterator();
		System.out.println("interator");
		System.out.println(it.hasNext()); //hasNext(); 읽어드릴 값이 있으면 true, 없으면 false 반환
		while(it.hasNext()) {
			int value = (int)it.next();
			if (value == 30) {
				it.remove();
			}
			
		}
		

	}

}
