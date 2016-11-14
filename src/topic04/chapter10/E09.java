package topic04.chapter10;

public class E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class course {
	private String courseName;
	private String [] students = new String[100];
	private int numberOfStudents;
	
	public void Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent (String student){
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
	public void dropStudent(String student){
		students.remove(student);
		numberOfStudents--;
	}
	public void clear(){
		students.clear();
	}
}