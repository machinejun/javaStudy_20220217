package a18_컬랙션.TreeMap;

import java.util.TreeMap;

public class StudentService {
	
	private final TreeMap<String, Student> studentMap;
	
	public StudentService( TreeMap<String, Student> studentMap) {
		this.studentMap = studentMap;
	}
	
	public void addStudent(String name, String email, String address, int roomnum) {
		Student student = new Student(name, email, address, roomnum);
		studentMap.put(name, student);
	}
	
	public boolean isEmpty(String str) {
		boolean result = false;
		if (str == null || str.equals("")) {
			result = true;
		}
		return result;
	}
	
	public void roommate(String name1, String name2) {
		if(isEmpty(name1) || isEmpty(name2)) {
			System.out.println("학생 이름을 입력해 주세요");
		}else {
			if(studentMap.containsKey(name1) && studentMap.containsKey(name2)) {
				if(studentMap.get(name1).getRoomnum() == studentMap.get(name2).getRoomnum()) {
					System.out.println("룸메이트 입니다.");
				}else {
					System.out.println("룸메이트가 아닙니다.");
				}
			}else {
				System.out.println("학생을 찾을 수 없습니다.");
			}
		}
	}
	
	

}
