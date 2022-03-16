package a18_컬랙션;

import java.util.ArrayList;

public class StudentService {
	private final ArrayList<Student> studentList;

	/*
	 * 1. 학생 추가 2. 학생 전체 정보 조회 3. 학생 이름으로 조회 4. 학생 정보 수정 5. 학생 정보 삭제
	 */

	public StudentService(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	// 1 . 학생 추가
	public void addStudent(String name, String email, String address) {
		Student studnet = Student.builder().name(name).email(email).address(address).build();
		studentList.add(studnet);
	}

	// 2. 학생 정보 조회
	public void showStudentAll() {
		System.out.println("[ 전체 학생정보 조회 ]");
		if (studentList.isEmpty()) {
			System.out.println("empty");
		} else {
			for (Student std : this.studentList) {
				System.out.println(std);
			}
		}
	}

	// 3. 학생 이름으로 조회
	public void showStudentByName(String name) {
		System.out.println("[" + name + " 학생정보 조회" + "]");
		for (Student std : this.studentList) {
			if (std.getName().equals(name)) {
				System.out.println(std);
				return;
			}
		}
		System.out.println(name + " 학생정보가 없습니다.");
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
		System.out.println("[" + name + " 학생정보 수정" + "]");
		for (Student student : studentList) {   // 프로그램은 흐름을 따라 설계하는 것이기 때문에 효율적으로 짜야한다. 조건판별 후 -> 로직 실행되도록
			if (student.getName().equals(name)) {
				if (isEmpty(email) && isEmpty(address)) { // null은 주소값 비교이기 때문에 equal을 사용하는 것이 아니라 "=="을 사용한다.
					System.out.println("수정할 정보가 없습니다.");
				} else {
					if (isEmpty(email)) {
						student.setAddress(address);
					} else if (isEmpty(address)) {
						student.setEmail(email);
					} else {
						student.setAddress(address);
						student.setEmail(email);
					}
					System.out.println("학생 수정완료");
					System.out.println();
				}
				return;
			}
		}
	}

	// 5. 삭제
	public void deleteStudentByName(String name) {
		System.out.println("[" + name + " 학생정보 삭제" + "]");
		for (Student std1 : this.studentList) {
			if (std1.getName().equals(name)) {
				studentList.remove(std1);
				System.out.println("학생 삭제 완료");
				return;
			}
		}
		System.out.println(name + " 학생정보가 없습니다.");
	}

}
