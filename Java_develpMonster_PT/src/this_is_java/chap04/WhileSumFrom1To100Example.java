package this_is_java.chap04;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; // 합계를 저장할 변수
		
		int i = 1; // 카운터 변수
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum); // while문으로 1 ~ 100까지 합을 출력
							   // 카운터 변수	// 합계를 저장할 변수

	}

}
