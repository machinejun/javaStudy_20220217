package a18_컬랙션.Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class AnswerTest {
	private ArrayList<Integer> stdAnswer;
	private ArrayList<Integer> answer;
	
	public AnswerTest() {
		stdAnswer = new ArrayList<Integer>();
		answer = new ArrayList<Integer>();
		
	}
	
	public void inputstdAswer(int a){
		if(a > 0 && a <6) {
			stdAnswer.add(a);	
		}else {
			System.out.println("정답은 1~5까지 중에서 선택하여야합니다.");
		}
	}
	
	public void inputAswer(int a){
		if(a > 0 && a <6) {
			answer.add(a);

		}else {
			System.out.println("정답은 1~5까지 중에서 선택하여야합니다.");

		}
	}
	
	public int chectAnswer(ArrayList<Integer> stdAnswer, ArrayList<Integer> answer, int answerNum) {
		int result = 0;
		for(int i =0; i< answerNum;i++) {
			if(stdAnswer.get(i) == answer.get(i)) {
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int answerNum = 0;
		
		Scanner sc = new Scanner(System.in);
		AnswerTest std = new AnswerTest();
		
		System.out.print("문항수를 입력하세요: ");
		answerNum = sc.nextInt();
		
		System.out.println("정답을 입력하세요 :");
		
		for(int i =0; i < answerNum ; i++) {
			System.out.print((i+1) + "의 정답: ");
			std.inputAswer(sc.nextInt());
		}
		
		System.out.println("학생의 정답을 입력하세요");
		for(int i =0; i < answerNum ; i++) {
			System.out.print((i+1) + "의 정답: ");
			std.inputstdAswer(sc.nextInt());
		}
		System.out.print("정답 갯수: ");
		System.out.println(std.chectAnswer(std.stdAnswer, std.answer, answerNum));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
