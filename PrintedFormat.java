import java.util.Scanner;
public class PrintedFormat
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name= sc.nextLine();
		System.out.print("Enter marks in Java: ");
		float marks= sc.nextFloat();
		System.out.printf("Name: %s & Marks: %f",name,marks);
	}
}
		
