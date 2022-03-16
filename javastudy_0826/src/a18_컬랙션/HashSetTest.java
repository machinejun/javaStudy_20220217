package a18_컬랙션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("김준일");
		strSet.add("김준이");
		strSet.add("김준삼");
		strSet.add("김준사");
		
		System.out.println(strSet);
		
		strSet.remove("김준일");
		
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator(); // 반복자를 가지고 순외
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("김준사")) {
				System.out.println(str);
				System.out.println();
			}
			System.out.println(str);
		}
	}

}
