import java.util.Scanner;
public class StudentResult
{  
       	// instance variable
	int marks;
	

	// static variable 
	static double total_marks = 0;

	public void Result()
	{  //creating a method 

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no.of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		

		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter the marks of the student"+i+":");
			marks = sc.nextInt();

			if(marks>=40){
				System.out.println("Pass");
			}
			else{

				System.out.println("Fail");
			}

		total_marks++;

	}

}
	public static void main(String[] args)
	{

		StudentResult obj = new StudentResult();
		obj.Result();

	}

}
