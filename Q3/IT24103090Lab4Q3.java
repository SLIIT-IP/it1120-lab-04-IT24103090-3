import java.util.Scanner;
public class IT24103090Lab4Q3
{
	public static void main(String[] args)
	{
	int number;
	String numberType;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number: ");
	number=input.nextInt();
	

	numberType=(number<0) ? "The number is: Negative" : ((number==0) ? "The number is: Zero" : "The number is: Positive"); 
		System.out.print(numberType);	
		
		
	}

}