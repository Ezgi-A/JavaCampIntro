package homeworkDay3;

public class Student extends User {
	private String studentName;
	private String universityName;
	private String departmentName;
	
	public Student() {
		
	}

	public Student(int userId, String userName, String password,String studentName, String universityName, String departmentName) {
		super(userId,userName,password);
		this.studentName = studentName;
		this.universityName = universityName;
		this.departmentName = departmentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
	
	

}
