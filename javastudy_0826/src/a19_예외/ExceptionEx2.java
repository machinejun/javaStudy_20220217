package a19_예외;

import java.io.IOException;
import java.util.ArrayList;

import a18_컬랙션.Student;

public class ExceptionEx2 {

	public void array() throws IOException ,IndexOutOfBoundsException, NullPointerException { // throws : 예외처리를 해주어야한다라는 제약
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(null);
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());

		for (int i = 0; i < students.size() + 1; i++) {
			Student student = students.get(i);
			student.setName("홍길동");
			System.out.println(student.getName());
		}
		System.out.println("메소드 끝까지 실행됨?");
	}

	public static void main(String[] args)  { //예외처리 제약 걸리
		ExceptionEx2 ex2 = new ExceptionEx2();
		try {
			ex2.array();
		} catch (IndexOutOfBoundsException | NullPointerException | IOException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}

//		try {
//
//		} catch (NullPointerException e) { // e로 에러의 매개변수가 전달된다.
//			System.out.println("주소를 참조할 수 없습니다.");
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("참조할 수 있는 인덱스의 크기를 초과하였습니다.");
//		} catch (Exception e) { // 모든 에러의 부모역할 -> 모든 에러 걸러줌
//			e.printStackTrace(); // 어떤 에러인지 호출해줌
//		} finally {
//			System.out.println("예외가 발생하든 발생하지 않든 무조건 실행");
//		}
//		System.out.println("프로그램 종료");
	}

}
