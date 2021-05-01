package homeworkDay3;

public class Instructor extends User {
	
	private String instructorName;
	private String profession;
	
	public Instructor() {
		
	}

	public Instructor(int userId, String userName, String password,String instructorName, String profession) {
		super(userId,userName,password);
		this.instructorName = instructorName;
		this.profession = profession;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	

	

}
