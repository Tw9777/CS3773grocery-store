package storageManagerModel;

public class SMModel {
	
	private String userNm;
	private String passWd;
	
	public SMModel() {

		this.userNm = "User";
		this.passWd = "12345";
	}
	
	public SMModel(String userNm, String passWd) {

		this.userNm = userNm;
		this.passWd = passWd;
	}
		
	public boolean logIn(String userNm, String passWd) {
		
		return (userNm == this.userNm) && (passWd == this.passWd);
	}

}
