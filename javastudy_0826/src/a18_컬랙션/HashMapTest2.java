package a18_컬랙션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {


	public static void main(String[] args) {
	/*
	 * 한글로 입력하면 영어로 바꾸는 거 
	 * 
	 * 1. 한글로 텀블러 -> 영어 tumbler
	 * 2. 머그컵 -> 영어 mugCup
	 * 3. 아메리카노 -> americano
	 * 4. 책 -> book
	 */
	HashMap<String, String> hashMap = new HashMap<String, String>();
	hashMap.put("머그컵", "mugcup");
	hashMap.put("텀블러", "tumbler");
	hashMap.put("아메리카노", "americano");
	hashMap.put("책", "book");
	
	String str = "책";
	
	if(hashMap.containsKey(str)) {
		System.out.println(hashMap.get(str));
	}else {
		System.out.println("해당 단어는 번역할 수 없습니다.");
	}
	
	Set<String> set = hashMap.keySet();
	Iterator<String> ir = set.iterator();
	while(ir.hasNext()) {
		System.out.println(ir.next());
	}
	
	
	if(str.equals("텀블러")) {
		str = "tumbler";
	}else if(str.equals("머그컵")) {
		str = "mugcup";
	}else if(str.equals("아메리카노")) {
		str= "americano";
	}else if(str.equals("책")) {
		str= "book";
	}else {
		System.out.println("error");
	}
	System.out.println(str);
	
		

	}
}
