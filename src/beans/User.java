package beans;

public class User {
	private String username;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void sayHello(){
		System.out.println("Hello "+username);
	}
}
