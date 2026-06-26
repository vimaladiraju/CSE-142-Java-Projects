// Text file imdb.txt: https://courses.cs.washington.edu/courses/cse142/20sp/lectures/imdb.txt

import java.util.*;
import java.io.*;

public class MovieCatalog {
	public static void main(String[] args ) throws FileNotFoundException {
		Scanner input = new Scanner(new File("imdb.txt"));
		Scanner console = new Scanner(System.in);
		System.out.println("search phrase? ");
		String phrase = console.nextLine();
		
		List<String> lines = find(input, phrase);
		for (String line : lines) {
			System.out.println(line);
		}
		console.close();
	}
	
	// searches given input for the next occurrence of the given phrase, returning the line (if there is one)
	public static List<String> find(Scanner input, String phrase) {
		List<String> lines = new ArrayList<>();
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.contains(phrase)) {
				lines.add(line);
			}
		}
		return lines;
	}
}
