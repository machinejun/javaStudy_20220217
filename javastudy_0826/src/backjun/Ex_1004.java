package backjun;

import java.util.Scanner;

public class Ex_1004 {
	
	public static double calc(int ax, int ay, int cx, int cy) {
		double result = 0;
		double s = 0;
		
		s = Math.pow((cx-ax),2) + Math.pow((cy-ay), 2);
		result = Math.sqrt(s);
		return result;
	}
	
	public static boolean posRange(int x1, int y1, int x2, int y2 ) {
		if (x1 > -1001 && x1 < 1001 && y1 > -1001 && y1 < 1001 && x2 > -1001 && x2 < 1001 && y2 > -1001 && y2 < 1001) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean cirRange(int cx, int cy, int r) {
		if (cx > -1001 && cx < 1001 && cy > -1001 && cy < 1001 && r > 0 && r < 1001) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int x1 =0, y1 =0, x2 =0, y2=0, cx=0, cy=0, r=0;
						
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			
			if(posRange(x1,y1,x2,y2)) {
				int cnt = 0;
				int n = sc.nextInt();
				
				for( int j = 0; j < n; j++) {
					cx = sc.nextInt();
					cy = sc.nextInt();
					r = sc.nextInt();
					
					if(cirRange(cx, cy, r)) {
						boolean case1 = calc(x1,y1,cx,cy) < r;
						boolean case2 = calc(x2,y2,cx,cy) < r;
						if(!(case1 && case2)) {
							if(case1) {
								cnt++;
							} else if(case2) {
								cnt++;
							}
						}
					}			
				}
				System.out.println(cnt);
			}
		}
	}
}
