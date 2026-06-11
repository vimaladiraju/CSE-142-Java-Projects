
public class Figure2 {
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
	
	// static methods
	
	public static void top() {
		System.out.println("  ______");
		System.out.println(" /......\\");
		System.out.println("/........\\");	
	}
	
	public static void bottom() {
		System.out.println("\\......../");
		System.out.println(" \\______/");
	}
	
	public static void barrier() {
		System.out.println("+--------+");
	}
	
	public static void egg() {
		top();
		bottom();
	}
	
	public static void teacup() {
		bottom();
		barrier();
	}
	
	public static void stopSign() {
		top();
		System.out.println("|  STOP  |");
		bottom();
	}
	
	public static void hat() {
		top();
		barrier();
	}
}
