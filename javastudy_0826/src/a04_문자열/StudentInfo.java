package a04_문자열;

public class StudentInfo {

	public static void main(String[] args) {
		String name = "하만준"; // String은 클래스와 같이 앞글자 대문자로 사용
		System.out.println(name);
		
		/*
		 * 2022년 02월   22일 코리아아이티아아카데미부산 학생정보
		 * year  month   day (문자열)
		 * 
		 * 
 		 * 
		 */
		int year_add =  1;
		int month_add = 1;
		
		String year =""+ (2022 + year_add);
		String month = ""+ (02 + month_add);
		String day = "22";
		
		String academy = "코리아아이티아아카데미";
				
		System.out.println(year + "년 " + month + "월 " + day+ "일 "+ academy + " 학생정보" );
		System.out.println("학생 이름: " + name);
		System.out.println(Integer.parseInt(day) + 1); // 문자열 형변환
		
		//////////////////////////////////////////////////
		
		/*
		 * 문자열 형변환
		 * 문자열 -> Integer(int) = 정수
		 * Interger.parseInt(문자열);
		 * ex> Interger.parseInt("100");   =  정수 100 으로 변환
		 * Double.parseDouble("15.123"); = 문자열 -> 실수로 변환
		 * 
		 * 정수, 실수 등을 문자열로 형변환
		 * Integer.toString(100); -> 문자열 100으로 변환
		 * Double.toString(3.41); -> 문자열 3.41으로 변환
		 * Boolean.toString(true); -> 문자열 true 로 변환
		 */
		
		int num = Integer.parseInt("10");
		double dNum = Double.parseDouble("3.14");
	
		System.out.println(dNum + 10);
		System.out.println(num + 15);
		System.out.println(!Boolean.parseBoolean("true"));
		
		String num2 = Integer.toString(200);
		System.out.println(num2 + 200);
		

	}

}
