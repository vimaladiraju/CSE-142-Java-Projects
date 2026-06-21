
public class ReturnTime {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		double days = toDays(millis) - 1.0 / 3.0;
		int year = 1970;
		int day = (int) days + 1;
		
		// Here's how to tell the program the exact date, e.g day 170 of 2026
		while (day > 365) {
			if (year % 4 == 0) {
				day -= 366;
				year++;
			} else {
				year++;
				day -= 365;
			}
		}
		
		System.out.println("millis = " + millis);
		System.out.println("days = " + days);
		System.out.println("year = " + year);
		System.out.println("day = " + day);
	}
	
	public static double toDays(double millis) {
		double days = millis / 1000.0 / 60.0 / 60.0 / 24.0;
		return days;
	}
}
