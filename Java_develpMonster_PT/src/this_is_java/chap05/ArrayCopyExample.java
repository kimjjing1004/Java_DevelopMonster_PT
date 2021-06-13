package this_is_java.chap05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		System.out.println(원본배열, 복사할 항목의 시작 인덱스,  새 배열, 새 배열에서 붙여넣을 시작 인덱스, 복사할 개수);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
			// 복사되지 않은 항목은 String[] 배열의 기본 초기값 null이 그대로 유지된다.
		}

	}

}
