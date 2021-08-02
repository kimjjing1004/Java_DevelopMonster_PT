package this_is_java.chap11;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {			//	toString() 재정의
		return company + ", " + os;
	}
	
}
