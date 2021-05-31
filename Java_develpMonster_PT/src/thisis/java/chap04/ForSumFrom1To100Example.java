package thisis.java.chap04;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		// for문에 += 연산은 축척되는 합계 변수라고 생각하면 된다
		// 그래서 출력값은 1 ~ 100까지의 합 5050 출력

	}

}
