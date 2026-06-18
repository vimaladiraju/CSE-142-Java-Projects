import java.util.Scanner;

public class GPACalculator {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Intro();
		
		System.out.println("Information for applicant #1:");
        double score1 = processApplicant(console);
        System.out.println();
        
        System.out.println("Information for applicant #2:");
        double score2 = processApplicant(console);
        System.out.println();
        
        reportResults(score1, score2);
	}
	
	public static void Intro() {
		System.out.println("This program compares two applicants to ");
		System.out.println("determine which one seems like the stronger");
		System.out.println("applicant. For each candidate I will need");
		System.out.println("either SAT or ACT scores plus a weighted GPA.");
		System.out.println();
	}
	
	public static double processApplicant (Scanner console) {
		double examScore = promptExam(console);
		double gpaScore = promptGPA(console);
		return examScore + gpaScore;
	}
	
	public static double promptExam(Scanner console) {
		System.out.print("do you have 1) SAT scores or 2) ACT scores? ");
        int choice = console.nextInt();
        if (choice == 1) {
            return computeSAT(console);
        } else {
            return computeACT(console);
        }
	}
	
	public static double promptGPA(Scanner console) {
		System.out.print("overall GPA? ");
        double actualGpa = console.nextDouble();
        System.out.print("max GPA? ");
        double maxGpa = console.nextDouble();
        System.out.print("Transcript Multiplier? ");
        double multiplier = console.nextDouble();
        
        double score = (actualGpa / maxGpa) * 100.0 * multiplier;
        System.out.println("GPA score = " + score);
        return score;
	}
	
	public static double computeSAT(Scanner console) {
		System.out.print("SAT math? ");
        int math = console.nextInt();
        System.out.print("SAT critical reading? ");
        int reading = console.nextInt();
        System.out.print("SAT writing? ");
        int writing = console.nextInt();
        
        double score = (2.0 * math + reading + writing) / 32.0;
        System.out.println("exam score = " + score);
        return score;
	}
	
	public static double computeACT(Scanner console) {
		System.out.print("ACT English? ");
        int english = console.nextInt();
        System.out.print("ACT math? ");
        int math = console.nextInt();
        System.out.print("ACT reading? ");
        int reading = console.nextInt();
        System.out.print("ACT science? ");
        int science = console.nextInt();
        
        double score = (english + 2.0 * math + reading + science) / 1.80;
        System.out.println("exam score = " + score);
        return score;
	}
	
	public static void reportResults(double overall1, double overall2) {
        System.out.println("First applicant overall score = " + overall1);
        System.out.println("Second applicant overall score = " + overall2);
        
        if (overall1 > overall2) {
            System.out.println("The first applicant seems to be better");
        } else if (overall2 > overall1) {
            System.out.println("The second applicant seems to be better");
        } else {
            System.out.println("The two applicants seem to be equal");
        }
    }
}
