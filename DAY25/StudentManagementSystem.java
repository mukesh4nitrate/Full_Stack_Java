package DAY25;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student {

	private int id;
	private String name;
	private int rollNo;
	private long phoneNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Student(int id, String name, int rollNo, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", phoneNo=" + phoneNo + "]";
	}

}

class StudentService {

	Scanner sc = new Scanner(System.in);

	public Student addStudent() {

		Student std = new Student();

		System.out.println("Enter the Student Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Name :");
		String stdName = sc.nextLine();
		System.out.println("Enter the Student Roll No : ");
		int rollNo = sc.nextInt();
		System.out.println("Enter the Phone No ");
		long phoneNo = sc.nextLong();

		std = new Student(id, stdName, rollNo, phoneNo);
		return std;

	}

	public void getStudents(List<Student> stds) {
		System.out.println(stds);
	}

	public Student getStudentById(List<Student> stds) {

		System.out.println("Enter the Student Id for show : ");
		int id = sc.nextInt();

		for (Student std : stds) {
			if (id == std.getId()) {
				return std;
			}
		}

		return null;
	}

	public List<Student> putStudent(List<Student> students) {
		System.out.println("Enter the Student Id for Update : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for(Student std : students) {
			if(std.getId()==id) {
				System.out.println("Enter the Student Name :");
				String stdName = sc.nextLine();
				System.out.println("Enter the Student Roll No : ");
				int rollNo = sc.nextInt();
				System.out.println("Enter the Phone No ");
				long phoneNo = sc.nextLong();
				std.setName(stdName);
				std.setPhoneNo(phoneNo);
				std.setRollNo(rollNo);
				
			}
		}
		
		return students;
	}
	
	
	public List<Student> deleteStudent(List<Student> students){

		System.out.println("Enter the Student Id for delete : ");
		int id = sc.nextInt();

		for (Student std : students) {
			if (id == std.getId()) {
				students.remove(std);
				return students;
			}
		}

		return students;
	}
 
}

public class StudentManagementSystem {

	public static void main(String[] args) {
		List<Student> ll = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		Student std = new Student();

		StudentService service = new StudentService();
		while (true) {
		    System.out.println("\nEnter your Choice");
		    System.out.println("1. Add Student");
		    System.out.println("2. View All Students");
		    System.out.println("3. View Student By ID");
		    System.out.println("4. Update Student");
		    System.out.println("5. Delete Student");
		    System.out.println("6. Exit");

		    int key = sc.nextInt();

		    if (key == 1) {
		        ll.add(service.addStudent());
		    } else if (key == 2) {
		        service.getStudents(ll);
		    } else if (key == 3) {
		        Student existStudent = service.getStudentById(ll);
		        if (existStudent != null) {
		            System.out.println(existStudent);
		        } else {
		            System.out.println("Student Not Found");
		        }
		    } else if (key == 4) {
		        ll = service.putStudent(ll);
		    } else if (key == 5) {
		        ll = service.deleteStudent(ll);
		    } else if (key == 6) {
		        System.out.println("Exiting Program. Goodbye!");
		        break;
		    } else {
		        System.out.println("Invalid choice. Try again.");
		    }
		}
	}
}

