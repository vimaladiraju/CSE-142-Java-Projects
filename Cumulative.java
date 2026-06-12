
public class Cumulative {
	public static void main(String[] args) {
		System.out.println("There was an old woman who swallowed a fly.");
		end();
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spidereatfly();
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		birdeatspider();
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		cateatbird();
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		dogeatcat();
	}
	
	public static void end() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}

	public static void spidereatfly() {
		System.out.println("She swallowed the spider to catch the fly,");
		end();
	}

	public static void birdeatspider() {
		System.out.println("She swallowed the bird to catch the spider,");
		spidereatfly();
	}

	public static void cateatbird() {
		System.out.println("She swallowed the cat to catch the bird,");
		birdeatspider();
	}

	public static void dogeatcat() {
		System.out.println("She swallowed the dog to catch the cat,");
		cateatbird();
	}
	
}
