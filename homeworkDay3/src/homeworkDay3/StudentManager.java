package homeworkDay3;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Successfully added.Student Name: "+student.getStudentName());
	}
	public void delete(Student student) {
		System.out.println("Successfully deleted.Student Name:"+student.getStudentName());
	}
	public void getInfo(Student student) {
		System.out.println("Student Name: "+student.getStudentName());
		System.out.println("University: "+student.getUniversityName());
		System.out.println("Department: "+student.getDepartmentName());
	}

}
