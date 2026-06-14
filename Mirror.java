import java.util.Scanner;

public class Mirror {
	public static void main(String[] args) {
		// take input for size
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter mirror size: ");
		int size = scanner.nextInt();
		
		drawLine(size);
		drawTopHalf(size);
		drawBottomHalf(size);
		drawLine(size);
		
		scanner.close();

	}
	
	public static void drawLine(int size) {
		System.out.print("#");
		for (int i = 0; i < size * 4; i++) {
			System.out.print("=");
		}
		System.out.println("#");
	}
	
	public static void drawTopHalf(int size) {
		double spaces = (size * 4 - 4) / 2;
		int dots = 0;
		for (int line = 0; line < size; line++) {
			System.out.print("|");
			for (int space = 0; space < spaces; space++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for (int dot = 0; dot < dots; dot++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int space = 0; space < spaces; space++) {
				System.out.print(" ");
			}
			System.out.println("|");
			spaces -= 2;
			dots += 4;
		}
	}
	
	public static void drawBottomHalf(int size) {
		int spaces = 0;
		int dots = (size * 4 - 4);
		for (int line = 0; line < size; line++) {
			System.out.print("|");
			for (int space = 0; space < spaces; space++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for (int dot = 0; dot < dots; dot++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int space = 0; space < spaces; space++) {
				System.out.print(" ");
			}
			System.out.println("|");
			spaces += 2;
			dots -= 4;
		}
	}
	
}
