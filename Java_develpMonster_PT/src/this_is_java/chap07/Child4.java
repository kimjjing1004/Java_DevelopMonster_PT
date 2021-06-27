package this_is_java.chap07;

public class Child4 extends Parent4 {
	private String name;
	
	public Child4() {
		this("홍길동");
		System.out.println("Child4() call");
	}
	
	public Child4(String name) {
		this.name = name;
		System.out.println("Child4(Sting name) call");
	}

}
