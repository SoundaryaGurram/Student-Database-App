package studentDatabaseApp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.enrollCourses();
s.tutionPayment();
System.out.println(s.showStatus());
	}

}
