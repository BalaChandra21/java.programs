import java.util.Scanner;
public class Customer
{
	//instance variable
	double customer_bill;
	
	//static variable
	static double total_sale=0;
	
	public void processBill()
	{
		Scanner console=new Scanner(System.in);
		System.out.print("enter the number of items: ");

		//local variable
		int n=console.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("enter item name " + i+": ");
			console.nextLine();
			String item_name=console.nextLine();
  			System.out.print("enter item price" + i+": ");
			double item_price=console.nextDouble();
			double discount=0.0;
			if(item_price > 500)
			{
				discount=item_price*0.05;
			}
			double final_price=item_price - discount;
			System.out.println("The final price of item name "+item_name+": "+final_price);
			customer_bill+=final_price;

		
		}  //for loop closed
		System.out.println("The final customer bill is "+customer_bill);
		total_sale +=customer_bill;

	}  //processbill method closed
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		String choice=null;
		do
		{
			Customer obj =new Customer();
			obj.processBill();
			System.out.print("Are you  next customer(yes/no)");
			choice=console.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Total sales of the day"+total_sale);
	}  //main method closed
		
}  //class closed
