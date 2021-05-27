package thisis.java.chap02;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
			// "\t"는 tab 역할 	// for 중괄호{} 블록을 5회 반복 실행 (i가 5보다 작을때까지이기 때문에 0 ~ 4까지 대입)
		}

	}

}
