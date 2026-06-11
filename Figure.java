
public class Figure {
	public static void main(String[] args) {
		egg();
		System.out.println();
		teacup();
		System.out.println();
		stopSign();
		System.out.println();
		hat();
		System.out.println();
	}
	
	// static method
	
	public static void egg() {
		System.out.println("  ______");
		System.out.println(" /......\\");
		System.out.println("/........\\");
		System.out.println("\\......../");
		System.out.println(" \\______/");
	}
	
	public static void teacup() {
		System.out.println("\\......../");
		System.out.println(" \\______/");
		System.out.println("+--------+");
	}
	
	public static void stopSign() {
		System.out.println("  ______");
		System.out.println(" /......\\");
		System.out.println("/........\\");
		System.out.println("|  STOP  |");
		System.out.println("\\......../");
		System.out.println(" \\______/");
	}
	
	public static void hat() {
		System.out.println("  ______");
		System.out.println(" /......\\");
		System.out.println("/........\\");
		System.out.println("+--------+");
	}
}
