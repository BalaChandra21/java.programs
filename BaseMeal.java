import java.util.Scanner;
public class BaseMeal 
{
	// static variable
    	static String restaurant_name = "Tasty Bites";

	// static variable
    	static double total_sales = 0.0;

    	// instance variable
    	double baseMeal_Cost;

    	public void calculateTotalCost() 
	{
       		Scanner console = new Scanner(System.in);

        	// Read base meal cost
        	System.out.print("Enter base meal cost: ");
        	baseMeal_Cost = console.nextDouble();

        	System.out.print("Enter percentage of Tip: ");
        	double tipPercent = console.nextDouble();

        	System.out.print("Enter percentage of Tax: ");
        	double taxPercent = console.nextDouble();

        	double tip = baseMeal_Cost * (tipPercent / 100);
        	double tax = baseMeal_Cost * (taxPercent / 100);
        	double total_cost = baseMeal_Cost + tip + tax;

        	System.out.println("----------Receipt----------");
        	System.out.println("Restaurant: " + restaurant_name);
        	System.out.println("Base Meal Cost: Rs. " + baseMeal_Cost);
        	System.out.println("Tip: Rs " + tip);
        	System.out.println("Tax: Rs " + tax);
        	System.out.println("Total Meal Cost: Rs " + total_cost);
        	System.out.println("---------------------------");

        	total_sales += total_cost;
    	}  //calculate total cost method closed
	public static void main(String args[])
		 {
        		Scanner console = new Scanner(System.in);
        		String choice=null;

        		do 
			{
           			BaseMeal obj = new BaseMeal();
            			obj.calculateTotalCost();

            			System.out.print("Are you the next customer? (yes/no): ");
            			choice = console.next();
        			} while (choice.equalsIgnoreCase("yes"));

       				System.out.println("Total sales of the day at " + restaurant_name + " is Rs " + total_sales);
    		}//main method closed
}//class closed
