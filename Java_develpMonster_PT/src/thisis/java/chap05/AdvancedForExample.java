package thisis.java.chap05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum += score;	// ":" 콜론은 scores배열 길이 까지 score(value)로써 다 관여한다고 생각하면 됨.
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
