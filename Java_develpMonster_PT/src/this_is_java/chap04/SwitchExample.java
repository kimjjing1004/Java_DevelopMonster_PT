package this_is_java.chap04;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
			
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
			
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
			
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
			
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
			
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		// if문 말고도 switch문으로도 표현 할 수 있다.
		// 실행 후 빠져나가기 위해 break 넣는거 잊지말자 안그러면 다음 case가 연달아 시행된다.
	}

}
