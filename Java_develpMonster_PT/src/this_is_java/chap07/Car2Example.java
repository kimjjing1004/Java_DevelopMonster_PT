package this_is_java.chap07;

public class Car2Example {
	public static void main(String[] args) {
		Car2 car2 = new Car2();										//	Car2 객체 생성
		
		for (int i = 1; i <= 5; i++) {								//	Car2 객체의 run()메소드
			int problemLocation = car2.run();						//	5번 반복 실행
			
			switch (problemLocation) {
			case 1:													//	앞왼쪽 타이어가 펑크 났을 때
				System.out.println("앞왼쪽 HankookTire로 교체");	//	HankookTire로 교체
				car2.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
				
			case 2:													//	앞오른쪽 타이어가 펑크 났을 때
				System.out.println("앞오른쪽 KumhoTire로 교체");	//	KumhoTire로 교체
				car2.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
				
			case 3:													//	뒤왼쪽 타이어가 펑크 났을 때
				System.out.println("뒤왼쪽 HankookTire로 교체");	//	HankookTire로 교체
				car2.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
				
			case 4:													//	뒤오른쪽 타이어가 펑크 났을 때
				System.out.println("뒤오른쪽 KumhoTire로 교체");	//	KumhoTire로 교체
				car2.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-----------------------------");	//	1회전 시 출력되는 내용을 구분
		}
	}

}
