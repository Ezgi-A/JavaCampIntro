package homeworkDay3;

public class main {

	public static void main(String[] args) {
		User user1=new User(1,"Ezgi123","12345");
		User user2=new User(2,"Engin456","4563");
		Student student=new Student(1,"Ezgi123","12345","Ezgi Arslan","Türk Hava Kurumu Üniversitesi","Elektrik-Elektronik");
		Instructor instructor=new Instructor(2,"Engin456","4563","Engin Demirog","Java");
		
		UserManager userManager=new UserManager();
		
		userManager.add(user1);
		userManager.add(user2);
		
		userManager.signIn(user1);
		userManager.signIn(user2);
		
		userManager.signOut(user1);
		userManager.signOut(user2);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.getInfo(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.getInfo(student);
		
		

	}

}
