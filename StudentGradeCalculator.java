import java.util.Scanner;
public class StudentGradeCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.print("Enter no.of Subjects:");
		int n=sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++)
		{
		    System.out.print("Enter the marks obtained in " +(i+1)+ ": ");
		    int marks=sc.nextInt();
		    total+=marks;
		}
		double avg=(double)total/n;
	char grade;
	if(avg>=90)
	grade='O';
	else if(avg>=80)
	grade='A';
	else if(avg>=70)
	grade='B';
	else if(avg>=60)
	grade='C';
	else if(avg>=50)
	grade='D';
	else if(avg>=40)
	grade='E';
	else
	grade='F';
	System.out.println("Total marks Scored"+total);
	System.out.println("Average Percentage Gained is "+ avg+"%");
	System.out.println("Grade : "+ grade);
		
	}
}

