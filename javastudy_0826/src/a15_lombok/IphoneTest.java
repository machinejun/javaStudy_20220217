package a15_lombok;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class IphoneTest {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); //날자만 들고옴
		System.out.println("현재날짜: " + now);
		
		LocalDateTime nowDateTime = LocalDateTime.now(); // 시간까지 들고옴
		System.out.println("dateTime: " + nowDateTime);
		
		System.out.println("datetime 표현형식변환: " + nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))); // 표형방식 변환->월 대문자, 분 소문자 
		
		
		System.out.println(DateTimeFormatter.ofPattern(""));
		Iphone iphoneMiniw = new Iphone(12, "미니", "white", 256, LocalDate.parse("2022-03-11").getYear());
		Iphone iphoneMaxw = new Iphone(13, "max", "white", 256, LocalDate.parse("2022-03-11").getYear());
		Iphone iphoneMinib = new Iphone(12, "미니", "black", 256, LocalDate.parse("2020-03-11").getYear());
		Iphone iphoneMaxb = new Iphone(12, "max", "black", 256, LocalDate.parse("2021-03-11").getYear());
		
		System.out.println(iphoneMinib);
		System.out.println(iphoneMiniw);
		System.out.println(iphoneMaxw);
		
		System.out.println("두 아이폰 비교: " + (iphoneMiniw.equals(iphoneMaxb)));
		

	}

}
