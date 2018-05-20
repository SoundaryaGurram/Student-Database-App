package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	String firstName;
	String lastName;
	int year;
	String  studentId;

	String uniqueId;
	int balance=0;;
	String courses=null;
	private static int costOfCourse=600;
	private static int id=1000;
	
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the First Name: ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter the Last Name: ");
		this.lastName=in.nextLine();
		
		System.out.print("\n1.Freshmen\n 2.Sophomore\n 3.Junior\n 4.Senior\nEnter the Grade level: ");
		this.year=in.nextInt();
		
		setStudentID();
		
		System.out.println(this.firstName+" "+this.lastName+" "+this.year+" "+studentId);
		

		
	}
	
	private void setStudentID()
	{
		
		this.studentId=year+""+id;
		id++;
		
	}
	
	public void enrollCourses()
	{
	do {
		System.out.print("Enter the courses that you want to enroll or Press Q to exit: ");
		Scanner in =new Scanner(System.in);
		String course=in.nextLine();
			if(!course.equals("Q"))
		{
				courses=courses+"\n"+course;
				balance=balance+costOfCourse;
		}
		else
		{
			break;
		}
		
	   } while(1!=0);
	System.out.println("Courses Enrolled:" +courses);

	}
	
	public void viewBalance()
	{
		System.out.println(balance);
	}
	
	public void tutionPayment()
	{
		System.out.print("Balance Before Payment: ");
		viewBalance();
		System.out.print("Enter the payment:");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		balance=balance-payment;
		System.out.println("Thank you for paying $"+payment);
		System.out.println("Your Outstanding balance is $"+balance);
	}
	
	public String showStatus()
	{
		return "Name: "+firstName + lastName +
				"\nCourses Enrolled: "+courses
				+"\nGradeLevel : "+year+
				"\nTutionBalance :"+balance;
	}
	
}
