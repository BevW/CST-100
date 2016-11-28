package topic06.chapter13;

class E13 {
/*
(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.
 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// Does not say to write a test program
		Course course = new Course("Jim John");
		course.addStudents("Robin Pineapple");
		course.addStudents("Neeko Pen");
		course.addStudents("Beverly Wine");
		
		Course course1 = course.clone();
		
		course1.addStudents("Apple Orange");
		
		String[] students = course.getStudents();
		System.out.println("The students in course are: ");
		for (int i = 0; i < course.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		
		String[] students1 = course1.getStudents();
		System.out.println("\nThe students in course1 are: ");
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students1[i] + ", ");
	}

}

// Got from book
class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudents(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents(){
		return students;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String getCourseName(){
		return courseName;
	}

	// Deep copy clone method
	@Override
	public Course clone() throws CloneNotSupportedException{
		// performs a shallow copy
		Course studentsClone = (Course)super.clone();
		// Deep copy on (whenBuilt is substituted with students) students
		// java.util.Date was also removed
		studentsClone.students = students.clone();
		return studentsClone;
		
	}
}