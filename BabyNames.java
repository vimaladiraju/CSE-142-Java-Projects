import java.io.*;
import java.awt.*;
import java.util.*;

// file names.txt download: https://courses.cs.washington.edu/courses/cse142/20sp/homework/names.txt

public class BabyNames {
    public static final int MAX_SCORE = 86;  // max possible score

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        
        printIntroduction();
        
        String fileName = "names.txt";
        
        System.out.print("name? ");
        String targetName = console.next();
        System.out.print("sex (M or F)? ");
        String targetSex = console.next();
        
        console.close();
        
        Scanner name = new Scanner(new File(fileName));
        
        String result = find(name, targetName, targetSex);

        if (!result.equals("name/sex combination not found")) {
       		Scanner processor = new Scanner(result);
       		String exactName = processor.next();
       		String exactSex = processor.next();
       		
       		int[] rankings = new int[14];
       		
       		int i = 0;
       		while (processor.hasNextInt() && i < rankings.length) {
       			rankings[i] = processor.nextInt();
       			i++;
       		}
       		
       		draw(rankings, exactName, exactSex);
       		
       	} else {
       		System.out.println(result);
       	}
    }
    
    public static void printIntroduction() {
    	System.out.println("This program allows you to search through the");
    	System.out.println("data from the Social Security Administration");
    	System.out.println("to see how popular a particular name has been");
    	System.out.println("since 1880.");
    }

    public static String find(Scanner input, String targetName, String gender) {
    	while (input.hasNextLine()) {
			String line = input.nextLine();
			
			Scanner lineTokens = new Scanner(line);
			if (lineTokens.hasNext()) {
				String currentName = lineTokens.next();
				String currentSex = lineTokens.next();
			
			
				if (currentName.equalsIgnoreCase(targetName) && currentSex.equalsIgnoreCase(gender)) {
					return line;
				}
			}
			lineTokens.close();
    	}
    	
    	return "name/sex combination not found";
    }
    
    // Uses a DrawingPanel to draw the histogram
    public static void draw(int[] rankings, String name, String sex) {
        int numberOfDecades = rankings.length;
        int widthPerDecade = 70;
        int panelWidth = numberOfDecades * widthPerDecade;
        int panelHeight = 550;
        int margin = 25;
        
        DrawingPanel panel = new DrawingPanel(panelWidth, panelHeight);
        Graphics g = panel.getGraphics();
        
        g.setColor(Color.BLACK);
        g.drawLine(0, margin, panelWidth, margin);
        g.drawLine(0, panelHeight - margin, panelWidth, panelHeight - margin);
        
        for (int i = 0; i < numberOfDecades; i++) {
        	int x = i * widthPerDecade;
        	g.drawLine(x, 0, x, panelHeight);
        	
        	int year = 1880 + (i * 10);
        	g.drawString(String.valueOf(year), x, panelHeight);
        }
        
        g.setColor(Color.RED);
        
        int lastX = 0;
        int lastY = 0;
        
        for (int i = 0; i < numberOfDecades; i++) {
        	int currentX = i * widthPerDecade;
        	int currentRank = rankings[i];
        	
        	int currentY;
        	if (currentRank == 0) {
        		currentY = panelHeight - margin;
        	} else {
        		currentY = margin + ((currentRank - 1) / 2);
        	}
        	
        	g.drawString(name + " " + sex + " " + currentRank, currentX, currentY);
        	
        	if (i > 0) {
        		g.drawLine(lastX, lastY, currentX, currentY);
        	}
        	
        	lastX = currentX;
        	lastY = currentY;
        }
        
    }   
}
