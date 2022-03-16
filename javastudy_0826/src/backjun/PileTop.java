package backjun;

public class PileTop {
	
	public int pileTop(int n) {
		if( n == 1) {
			return 1;
		}
		return 1 + 2*pileTop(n-1);
	}

	public static void main(String[] args) {
		

	}

}
