package topic04.chapter10;
/*
(The Course class) Revise the Course class as follows:
---The array size is fixed in Listing 10.6. Improve it to automatically increase
the array size by creating a new larger array and copying the contents of the
current array to it.
---Implement the dropStudent method.
---Add a new method named clear() that removes all students from the
course.
Write a test program that creates a course, adds three students, removes one,
and displays the students in the course.
 */
public class E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Make a course object
		Course chemI = new Course ("Chem I");
		
		// Add three students
		chemI.addStudent("Neeko Dog");
		chemI.addStudent("Kida Bordercollie");
		chemI.addStudent("Kitten Cat");
		
		// Remove a student
		chemI.dropStudent("Kitten Cat");
		
		// Display students
		System.out.println("The students in " + chemI.getCourseName() + " are: ");
		String [] students = chemI.getStudents();
		for(int i = 0; i < chemI.getNumberOfStudents(); i++)
			System.out.println(students[i] + " ");
		System.out.println();
	}

}
class Course {
	private String courseName;
	private String [] students = new String[1];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent (String student){
		if (numberOfStudents == students.length){
			String[] students2 = new String[students.length + 1];
			for (int i = 0; i < numberOfStudents; i++){
				students2[i] = students[i];
			}
			students = students2;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String getCourseName(){
		return courseName;
	}
	// Index of student
	private int findStudent(String student){
		for (int i = 0; i < numberOfStudents; i++){
			if (students[i].equals(student))
				return i;
		}
		return -1;
	}
	
	//Overloaded methods
	private void dropStudent(int index){
		String[] str = new String[students.length - 1];
		for (int i = 0, j = 0; i < str.length; i++, j++){
			if(i == index){
				j++;
			}
			str[i] = students[j];
		}
		this.students = str;
		numberOfStudents--;
	}
	public void dropStudent(String student){
		int index = findStudent(student);
		if (index >= 0)
			dropStudent(index);
		else
			System.out.println(student + "is not in " + courseName);
	}
	
	public void clear(){
		students = new String [1];
		numberOfStudents = 0;
	}
}