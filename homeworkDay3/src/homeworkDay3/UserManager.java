package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println("Successfully added user: "+user.getUserName());
	}
	public void delete(User user) {
		System.out.println("Successfully deleted user: "+user.getUserName());
	}
	public void signIn(User user) {
		System.out.println(user.getUserName()+" Successfully signed in.");
	}
	public void signOut(User user) {
		System.out.println(user.getUserName()+" Successfully signed out.");
	}

}
