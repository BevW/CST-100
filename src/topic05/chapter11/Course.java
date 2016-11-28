package topic05.chapter11;
import java.util.ArrayList;
/*
(The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
to replace an array to store students. Draw the new UML diagram for the class.
You should not change the original contract of the Course class (i.e., the definition
of the constructors and methods should not be changed, but the private
members may be changed.)
 */
public class Course {

	private String courseName;
	private ArrayList<String>student;

	// Constructor
	public Course (String coursName){
		student = new ArrayList<String>();
	}
	// I am not sure why it is not working
	// I followed example 11.8
	// Add a student to the list
	public void addStudent(String student) {
		student.add(student);
	}
	// Returns students in an array
	public String[] getStudents() {
		String[] a = new String[student.size()];
		return student.toArray(a);
	}
	// Returns number of students
	public int getNumberOfStudents() {
		return student.size();
	}
	// Returns course name
	public String getCourseName() {
		return courseName;
	}
	// I am not sure why it is not working
	// it has the same format as Listing 11.8
	// Removes a student for list
	public void dropStudent(String student) {
		student.remove(student);

	}
}
