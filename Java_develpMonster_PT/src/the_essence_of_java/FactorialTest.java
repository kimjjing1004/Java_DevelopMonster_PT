package the_essence_of_java;

public class FactorialTest {

	public static void main(String[] args) {
//		int result = factorial(4);
		
//		System.out.println(result);
	}
	/*
	static int factorial (int n) {
		int result = 0;
		
		if (n ==1)
			result = 1;
		else
			result = n * factorial (n-1);	//	다시 메서드 자신을 호출한다.
		return result;
	}
	*/
	int factorial (int n) {
		int result = 1;
		 while (n!= 0)
			result *= n--;
		 return result;
	}
	

}
