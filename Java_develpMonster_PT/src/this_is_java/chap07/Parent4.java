package this_is_java.chap07;

public class Parent4 {
	public String nation;
	
	public Parent4() {
		this("대한민국");
		System.out.println("Parent4() call");
	}
	
	public Parent4(String nation) {
		this.nation = nation;
		System.out.println("Parent4(String nation) call");
	}

}
