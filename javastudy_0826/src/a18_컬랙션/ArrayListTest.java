package a18_컬랙션;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
		
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		strList.set(2, "q");
		strList.set(3, "q");
		strList.set(4, "q");
		
		
		
//		System.out.println(intList.size());
//		System.out.println(strList.size());
//		System.out.println();
//		for(int i = 0; i < intList.size(); i++) {
//			System.out.println(intList.get(i));
//		}
//		System.out.println();
//		for(int i = 0; i < strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
//		System.out.println();
//		for(int num : intList) {
//			System.out.println(num);
//		}
//		System.out.println();
//		for(String s : strList) {
//			System.out.println(s);
//		}
		
//		strList.remove(strList.size()-1);
//		System.out.println(strList);
//		strList.remove(strList.size()-1);
//		System.out.println(strList);
		
		//리스트가 비어있지 않으면 계속 반복하며 가장 뒤에 있는 값을 삭제
//		while(!(strList.isEmpty())) {
//			strList.remove(strList.size()-1);
//			System.out.println(strList);
//		}
		
		//리스트에 q가 존재하면 해당 위치의 값을 삭제
//		if(strList.contains("q")){
//			for(int i = 0; i<strList.size();i++) {
//				if(strList.get(i).equals("q")) {
//					System.out.println(strList.remove(i));
//					break;
//				}
//			}
//		}else {
//			System.out.println(strList);	
//		}
		
		while(strList.contains("q")) {
			System.out.println(strList.remove("q"));
		}
		System.out.println(strList);
		
		if(!(strList.isEmpty())) {
			strList.clear();
		}
		System.out.println(strList);
		
	}
}
