package thisis.java.chap03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		// x++에서 10을 대입 후 +1하여 11이 되고, ++x에서 먼저 +1하여 12가 되어 x에 대입 
		
		System.out.println("------------------");
		y--;
		--y;
		System.out.println("y="+ y);
		// y--에서 10을 대입 후 -1하여 9가 되고, --y에서 먼저 -1하여 8이 되어 y에 대입
		
		System.out.println("------------------");
		z = x++;
		System.out.println("z=" + z); // x++에서 12를 x에 먼저 대입하기 때문에 z값이 12로 출력되고, 그 이후 x값이 +1하여 13(출력전)
		System.out.println("x=" + x); // z출력 후 x값이 +1 하여 13을 x에 대입하여 13을 출력
		
		System.out.println("------------------");
		z = ++x;
		System.out.println("z=" + z); // ++x에서 x값이 13이 +1하여 먼저 14가 된 후 x값에 대입, z = 14출력
		System.out.println("x=" + x); // 14가 된 x값을 그대로 대입
		
		System.out.println("------------------");
		z = ++x + y++;
		System.out.println("z=" + z);// ++x에서 14가 +1먼저 하여 15가 된 후 x에 대입, y++에서 8을 먼저 대입 후, x값과 y값을 더하면 z값은 23
		System.out.println("x=" + x);// 15가 된 x값을 그대로 대입
		System.out.println("y=" + y);// 8이 였던 y값이 연산 이후 +1여 y값이 9가 되어 대입
	}

}
