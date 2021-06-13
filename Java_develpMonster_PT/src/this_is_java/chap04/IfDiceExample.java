package this_is_java.chap04;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1; // 주사위 번호 1 ~ 6까지 중에 하나 랜덤으로 뽑기
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		// 랜덤으로 하나 뽑는 거기 때문에 출력 할때마다 1 ~ 6까지 각자 다른 값이 나온다.
	}

}
