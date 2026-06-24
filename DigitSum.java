
public class DigitSum {
	public static void main(String[] args) {
		int sum = digitSum(935);
		System.out.println("sum = " + sum);
		System.out.println();
	}
	
	public static int digitSum(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			sum = sum + digit;
		}
		return sum;
	}
}
