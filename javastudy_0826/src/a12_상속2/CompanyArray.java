package a12_상속2;

public class CompanyArray {

	public static void main(String[] args) {
//		int[] numArray = new int[5];
//		
//		for(int i = 0; i < numArray.length; i++) {
//			numArray[i] = i + 1;
//			
//			
//		}
//		
//		for(int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//			
//			
//		}
//////////////////////////////////////////////////////////////////		
//		String[] strArray = new String[5];
//		for(int i = 0; i < strArray.length; i ++) {
//			strArray[i] = "김준" + (i+1);
//		}
//
//		
//		for(int i = 0; i < strArray.length; i ++) {
//			System.out.println(strArray[i]);
//		}
//////////////////////////////////////////////////////////////////////////
		Company[] companies = new Company[5];
		
		companies[0] = new ElectronicCompany("삼성");
		companies[1] = new ElectronicCompany("lg");
		companies[2] = new DeliveryCompany("배민", "배달");
		companies[3] = new DeliveryCompany("요기요", "배달");
		companies[4] = new Company("일반회사");
		
		
		for(int i = 0; i < companies.length; i ++) {
			
			companies[i].showCompanyInfo();
			
			if( companies[i] instanceof ElectronicCompany) {
				ElectronicCompany ec = (ElectronicCompany)companies[i];
				ec.addFactory();
			}else if (companies[i] instanceof DeliveryCompany) {
				DeliveryCompany dc = (DeliveryCompany)companies[i];
				dc.addMotocycle();
			}else {
				System.out.println("다운캐스팅 error");
			}
		}
		
		
	}

}
