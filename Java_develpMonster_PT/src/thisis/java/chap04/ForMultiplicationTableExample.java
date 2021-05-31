package thisis.java.chap04;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
				// m과 n이 각각 2 ~ 9까지, 1 ~ 9까지 for문 안에 이중 for문을 설정하여
				// 구구단을 실행
			}
		}

	}

}
