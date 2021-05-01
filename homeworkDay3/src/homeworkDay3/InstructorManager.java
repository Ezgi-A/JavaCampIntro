package homeworkDay3;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("Successfully added. Instructor Name: "+instructor.getInstructorName());
	}
	public void delete(Instructor instructor) {
		System.out.println("Successfully deleted. Instructor Name: "+instructor.getInstructorName());
	}
	public void getInfo(Instructor instructor) {
		System.out.println("Instructor Name: "+instructor.getInstructorName());
		System.out.println("Profession "+instructor.getProfession());
	}


}
