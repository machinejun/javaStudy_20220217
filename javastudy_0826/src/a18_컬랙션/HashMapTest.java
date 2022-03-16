package a18_컬랙션;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	// TreeMap 확인!!!

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "김준일");
		hashMap.put("나", "김준오");
		hashMap.put("다", "김준이");
		hashMap.put("라", "김준삼");
		hashMap.put("마", "김준사");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("김준사"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "김준육"));
		System.out.println(hashMap);
		

	}

}
