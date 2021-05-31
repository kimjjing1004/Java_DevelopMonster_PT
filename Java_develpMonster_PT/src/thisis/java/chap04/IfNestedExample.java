package thisis.java.chap04;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81; // 81 <= ... <= 100 사이에 속하는 점수 뽑기
		System.out.println("점수: " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
		// 중첩 if문은 중첩의 단계는 제한이 없고 switch문, for문, while문, do-while문 또한 서로 중첩 시킬 수 있다.
	}

}
