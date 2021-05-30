package thisis.java.chap03;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		// score의 초기값을 정수 85로 선언 후
		// 조건식 score 85가 90보다 크면 'A'
		// 아니면 score 85가 80보다 크면 'B'
		// 아니면 'C'
		// 그래서 "85점은 B등급입니다." 출력됨
	}

}
