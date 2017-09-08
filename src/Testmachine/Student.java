package Testmachine;

public class Student {

	private String name;
	private String login;
	private String pwd;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Student(String name, String login, String pwd) {
		super();
		this.name = name;
		this.login = login;
		this.pwd = pwd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
