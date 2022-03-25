package 질럿_놀이;

public class Zergling extends Units{
	private static int zerglingSid;
	private int id;

	public Zergling(String name) {
		super(6, name, 50);
		zerglingSid++;
		this.id = zerglingSid;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(" id  : " + id);
		System.out.println("--------------------------------------");	
	}
}
