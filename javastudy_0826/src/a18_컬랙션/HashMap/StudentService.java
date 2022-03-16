package a18_컬랙션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StudentService {
	private final HashMap<String, Student> studentMap;

	/*
	 * 1. 학생 추가 2. 학생 전체 정보 조회 3. 학생 이름으로 조회 4. 학생 정보 수정 5. 학생 정보 삭제
	 */

	public StudentService(HashMap<String ,Student> studentMap) {
		this.studentMap = studentMap;
	}

	// 1 . 학생 추가
	public void addStudent(String name, String email, String address) {
		Student student = Student.builder()
								.name(name)
								.email(email)
								.address(address)
								.build();
		studentMap.put(name, student);
	}

	// 2. 학생 정보 조회
	public void showStudentAll() {
		System.out.println("[전체 학생정보 조회]");
		if(studentMap.isEmpty()) {
			System.out.println("등록된학생이 없습니다.");
		}else {
			Iterator<String> ir = studentMap.keySet().iterator();
			while(ir.hasNext()) {
				System.out.println(studentMap.get(ir.next()));
			}
		}
		System.out.println();
	}

	// 3. 학생 이름으로 조회
	public void showStudentByName(String name) {
		System.out.println("[" + name + "의 학생정보 조회]");
		if(studentMap.containsKey(name)) {
			System.out.println(studentMap.get(name));
		}else {
			System.out.println("학생이 없습니다.");
		}
		System.out.println();
	}

	public boolean isEmpty(String str) {
		boolean result = false;
		if (str == null || str.equals("")) {
			result = true;
		}
		return result;
	}

	// 4. 학생 정보 수정
	public void updateStudentByName(String name, String email, String address) {
		System.out.println("[" + name + "의 학생정보 수정]");
		if(!(studentMap.containsKey(name)) || isEmpty(name)) {
			System.out.println("이름이 올바르지 않습니다.");
		}else {
			if(isEmpty(email) && isEmpty(address)) {
				System.out.println("수정할 정보가 없습니다.");
			}else if(isEmpty(email)) {
				studentMap.get(name).setAddress(address);
				System.out.println("학생 정보 수정완료");
			}else if(isEmpty(address)) {
				studentMap.get(name).setEmail(email);
				System.out.println("학생 정보 수정완료");
			}else {
				studentMap.get(name).setAddress(address);
				studentMap.get(name).setEmail(email);
				System.out.println("학생 정보 수정완료");
			}
		}
		System.out.println();
		
	}

	// 5. 삭제
	public void deleteStudentByName(String name) {
		System.out.println("[" + name + "의 회원정보 삭제]");
		if(studentMap.containsKey(name)) {
			studentMap.remove(name);
			System.out.println("학생 삭제 완료");
		}else {
			System.out.println("학생이 없습니다.");
		}
		System.out.println();
		
	}

}
