package topic05.chapter11;

public class E02 {
/*
Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create objects
		Person person = new Person("John Doe", "123 Wilson St", "123 123 1234", "john.doe@gmail.com");
		Student student = new Student("Jane Doe", "123 Maple St", "321 321 4321", "jane.doe@gamil.com", 3);
		Employee employee = new Employee("Doe Jane", "321 Wilson St", "234 234 2345", "doe.jane@gmail.com", 
				4, 4/13/2010, 55000);
		Faculty faculty = new Faculty("Doe John", "321 Maple St", "432 432 5432", "doe.john@gamil.com",
				6, 5/12/2001, 60000, "1pm - 2pm", 10);
		Staff staff = new Staff("Neeko Smith", "123 Bark Rd.", "987 987 9876", "smith.neeko@puppie.com", 1, 5/24/14, 53000, "Dog");
		
		// Invoke toString methods
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
