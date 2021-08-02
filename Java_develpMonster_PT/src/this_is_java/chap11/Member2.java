package this_is_java.chap11;

public class Member2 implements Cloneable {	//	복제할 수 있다는 표시
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member2 getMember2() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();	//	clone() 메소드의 리턴 타입은 Object이므로 Member 타입으로 캐스팅해야함
		} catch (CloneNotSupportedException e) {
			
		}
		return cloned;
	}
}
