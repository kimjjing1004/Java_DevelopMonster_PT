package thisis.java.chap04;

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int)(Math.random() * 6) + 1;	// 1 ~ 6 중에 랜덤으로 한가지를 선택
			System.out.println(num);
			if (num == 6) {
				break; // 6이 나오는 순간 break; 로 빠지면서 프로그램 종료 출력
			}
		}
		System.out.println("프로그램 종료");	//

	}

}
