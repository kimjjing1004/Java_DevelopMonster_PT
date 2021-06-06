package thisis.java.chap05;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max); // 왜 출력값이 8이 나오는지 물어보자!

	}

}
