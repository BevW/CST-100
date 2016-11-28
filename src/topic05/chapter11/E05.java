package topic05.chapter11;

public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course = new Course ("Math");
		
		course.addStudent("Jim John");
		course.addStudent("Freddy Burgus");
		course.addStudent("Neeko Smith");
		
		System.out.println("Sudents in the course: ");
		String [] students = course.getStudents();
		for (int i = 0; i < course.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		
		course.dropStudent("Jim John");
		System.out.println("Updated list: ");
		for (int i = 0; i < course.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
	}

}
