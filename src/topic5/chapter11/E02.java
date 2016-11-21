package topic5.chapter11;

public class E02 {
/*
Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create objects
		Person person = new Person(John Doe, 123 Wilson St, 123 123 1234, john.doe@gmail.com);
		Student student = new Student(Jane Doe, 123 Maple St, 321 321 4321, jane.doe@gamil.com, 2);
		Employee employee = new Employee(Doe Jane, 321 Wilson St, 234 234 2345, doe.jane@gmail.com, 
				4, 4/13/2010, 55000);
		Faculty faculty = new Faculty(Doe John, 321 Maple St, 432 432 5432, doe.john@gamil.com,
				2 - 4, 6);
		Staff staff = new Staff(Neeko Smith, 123 Bark Rd. 987 987 9876, smith.neeko@puppie.com,
				Dog);
		
		// Invoke toString methods
		System.out.println(Person);
		System.out.println(Student);
		System.out.println(Employee);
		System.out.println(Faculty);
		System.out.println(Staff);
			}
		}
	}
}
