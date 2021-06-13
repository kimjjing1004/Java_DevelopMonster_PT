 package this_is_java.chap04;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				} // 반복문이 중첩 되있을 경우 break문은 가장 가까운 반복문만 종료 하기 때문에 
			}		// 중첩된 반복문에서 바깥문 반복문까지 종료 시키려면 바깥쪽 반복문에 이름을 붙이고 break 이름; 사용!
		}
		System.out.println("프로그램 실행 종료");
	
	}

}
