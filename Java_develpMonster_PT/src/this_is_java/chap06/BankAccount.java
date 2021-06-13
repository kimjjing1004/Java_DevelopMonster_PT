package this_is_java.chap06;

public class BankAccount {
	private String num;
	private String owner;
	private int initial;
	
	public BankAccount(String num, String owner, int initial) {
		this.num = num;
		this.owner = owner;
		this.initial = initial;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
}
