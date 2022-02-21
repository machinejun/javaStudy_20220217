package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 *  1. 학번 : 20220001 -> stdCode
		 *  2. 이름 : ___ 	   -> name1, name2, name3
		 *  3. 학년 : _        -> stdYear 
		 *  4. 성적 : 85.5     -> score(실수)
		 *  5. 평점 : B		   -> grade
		 *  6. 성별 : 남성(true), 여성(False)   -> boolean
		 */
		
		int StdCode = 20220001;
		char name1, name2, name3;
		name1 = '하';
		name2 = '만';
		name3 = '준';
		int StdYear = 1;
		float Score = 85.5f;
		char grade = 'B';
		boolean gender = true;
	
		

		System.out.println("학번: " + StdCode);
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3); // ""+ 문자열로 업캐스팅☆
		System.out.println("학년: " + StdYear);
		System.out.println("성적: " + (Score + 5.0));
		System.out.println("평점: " + grade);
		if(gender == true) {
			System.out.println("성별: 남성");
			
		}else {
			System.out.println("성별: 여성");
		}
		


		
		
		


	}

}
