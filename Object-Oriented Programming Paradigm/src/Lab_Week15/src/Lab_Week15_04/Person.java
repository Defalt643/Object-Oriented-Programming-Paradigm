package Lab_Week15_04;

public class Person {
	private String username,password,name,email;
	public Person(String username,String password,String name,String email) {
		this.username=username;
		this.password=password;
		this.name=name;
		this.email=email;
	}public String toString() {
		return "Name:"+name+"\nEmail:"+email;
	}
}
