package this_is_java.chap06;

public class PrinterExample {

	public static void main(String[] args) {
		// 객체 외부에서 메소드 호출	// 메소드 오버로딩
		Printer printer = new Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		// 정적 멤버 사용
		/*
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		*/
	}

}
