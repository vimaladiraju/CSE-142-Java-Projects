import java.util.*;

public class Seven {
	public static void main(String[] args) {
		Random r = new Random();
		boolean result = seven(r);
		System.out.println();
		System.out.println("result = " + result);
		System.out.println();
	}
	
	public static boolean seven(Random r) {
		for (int i = 1; i <= 10; i++) {
			int next = r.nextInt(30) + 1;
			System.out.print(next + " ");
			if (next == 7) {
				return true;
			}
		}
		return false;
	}
}
