package model;

public class Student {



	
	private int sid;
	private String name;
	private String email;
	private int age;
	private String skill;
	
	

	
	
	public Student(int sid, String name, String email, int age, String skill) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.skill = skill;
	}



	public Student() {

	}



	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", age=" + age + ", skill=" + skill
				+ "]";
	}
	
	

}

