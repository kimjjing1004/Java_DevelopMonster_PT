package this_is_java.chap04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 100 ~ 90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80 ~ 89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70 ~ 79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
			// else if는 else와 if 따로 쓰는게 없이 합쳐 논것이고
			// 75는 70 ~ 79에 속하므로 등급은 C가 출력
	}

}
