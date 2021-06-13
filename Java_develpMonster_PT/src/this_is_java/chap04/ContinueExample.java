package this_is_java.chap04;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {	//	2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue;
			}	// 특정 조건을 만족하는 경우에 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다. 
			System.out.println(i);	//	홀수는 실행되지 않는다.
		}
	}

}
