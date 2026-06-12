// Here I use different variables to calculate a total homework score.
public class Fri {
	public static void main(String[] args) {
		// hw1 = 10, hw2 = 16, hw3-8 = 20, section=20
		int homeworkTotal = 10+16+6*20+20;
		int homeworkScore = 8+14+6*18+20;
		double homework = 100.0 * homeworkScore / homeworkTotal;
		System.out.println("total = " + homeworkTotal);
		System.out.println("score = " + homeworkScore);
		System.out.println("overall = " + homework);
		
	}
}
