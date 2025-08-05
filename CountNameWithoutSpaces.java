import java.util.Scanner;
public class CountNameWithoutSpaces 
{ 
    public static void main(String args[]) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter your name: ");
        	String name = sc.nextLine();

        	// To replace white spaces with empty space
        	String without_space = name.replace(" ", "");

        	// count the no. of characters in given string
        	int count = without_space.length();

        	// Display no. of characters
        	System.out.printf("Your name: %s & Total length: %d\n", name, count);
    	}
}
