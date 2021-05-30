package thisis.java.chap04;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		// 마지막 출력은 두번째 if문과 상관없이 그대로 출력된다. 그 이유는,
		// 두번째 if문은 중괄호과 없기 때문에 조건이 바로 밑에줄만 적용되기 때문이다.
		// 따라서 조건식에서 벗어난 출력이기 때문에, if문과는 아무런 관련이 없다.

	}

}
