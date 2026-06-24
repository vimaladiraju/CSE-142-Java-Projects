import java.util.*;

public class Roll7 {
	
	public static void main(String[] args) {
		Random r = new Random();
		roll7(r);
	}
	
	public static void roll7(Random r) {
		int num1 = 0;
		int num2 = 0;
		int rolls = 0;
		while (num1 + num2 != 7) {
			num1 = r.nextInt(6) + 1;
			num2 = r.nextInt(6) + 1;
			int sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
			rolls += 1;
		}
		System.out.println("sum of 7 reached in " + rolls + " rolls");
	}
}
