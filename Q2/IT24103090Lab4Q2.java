import java.util.Scanner;
public class IT24103090Lab4Q2
{
	public static void main(String[] args)
	{
	double examMarks;
	double labSubmissionMarks;
	double percentageExam;
	double percentageLab;
	double percentageExamT;

	Scanner input=new Scanner(System.in);


	System.out.print("Please enter exam marks (out of 100): ");
	examMarks=input.nextDouble();
	
	
	if((examMarks>=0)&&(examMarks<=100))
		{

		System.out.print("Please enter Lab Submission marks (out of 100): ");
		labSubmissionMarks=input.nextDouble();

		if((labSubmissionMarks>=0)&&(labSubmissionMarks<=100))
			{
				System.out.print("Please enter the percentage given for the exam: ");
				percentageExam=input.nextDouble();

				System.out.print("Please enter the percentage given for the Lab Submission: ");
				percentageLab=input.nextDouble();

				if((percentageExam+percentageLab)==100)
					{
						System.out.print((examMarks*percentageExam/100)+(labSubmissionMarks*percentageLab/100));
					}
				else
					{
						System.out.print("The percentages must add up to 100");
					}
			}
		else
			{
				System.out.print("Invalid input for Lab Submission Marks");
			}	

			
			
		}
	else
		{
		System.out.print("Invalid Input for exam marks");
		}
	
	}
	

}