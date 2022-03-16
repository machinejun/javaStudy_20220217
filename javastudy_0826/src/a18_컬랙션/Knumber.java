package a18_컬랙션;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Knumber {
	static List<Integer> array;
	ArrayList<ArrayList<Integer>> commands;
	ArrayList<Integer> command;
	static ArrayList<Integer> result;
	static Scanner sc;
	
	
	public List<Integer> makeArray() {
		sc = new Scanner(System.in);
		int arraysize = 7;
		array = new ArrayList<Integer>(arraysize);
		System.out.print("[");
		for(int i = 0; i<arraysize; i++) {
			int num = sc.nextInt();
			array.add(num);
		}
		System.out.println("]");
		
		sc.close();
		return array;
	}
	
	
	public ArrayList<ArrayList<Integer>> enterCommand() { //generic이 있을 때는 다 적어주어야함 [[1 2 3] [1 2 3] [1 2 3]]
		sc = new Scanner(System.in);
		commands = new ArrayList<ArrayList<Integer>>(3);
		
		System.out.print("[");
		for(int i = 0; i< 3; i++) {
			
			command = new ArrayList<Integer>(3);
			System.out.print("[");
			
			for(int j=0; j<3; j++) {
				int num = sc.nextInt();
				command.add(num);

			}
			
			System.out.println("]");
			commands.add(command);
			
		}
		System.out.println("]");
		System.out.println(commands);
//		for(List<Integer> c : commands) {
//			System.out.println(((Object)c).hashCode());
//		}
//		System.out.println(((Object)command).hashCode());
		return commands;
	}
	
	public static void calculate( ArrayList<ArrayList<Integer>> commands , List<Integer> array) {
		
		int num= 0, num1 =0, num2 =0;
		System.out.print("[ ");
		for(int i =0; i < commands.size();i++) {
			result = new ArrayList<Integer>();
			num = commands.get(i).get(0);
			num1 = commands.get(i).get(1);
			num2 = commands.get(i).get(2);
		
			for(int j = 0; j < num1-num+1; j++ ) {
				result.add(array.get(j+(num-1)));
			}
			result.sort(Comparator.naturalOrder());
			System.out.print(result.get(num2-1)+" ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {		
		Knumber k = new Knumber();
		calculate(k.enterCommand(), k.makeArray());
	}
		
		

}	
