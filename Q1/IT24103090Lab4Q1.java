import java.util.Scanner;
public class IT24103090Lab4Q1
{
	public static void main(String[] args)
	{
	int number;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number: ");
	number=input.nextInt();
	if(number<0)
	{
		System.out.print("The number is : Negative");	
	} 
	else if(number>0)
	{
		System.out.print("The number is : positive");	
	} 
	else
	{
		System.out.print("The number is Zero");	
	} 	
	}

}