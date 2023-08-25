package day07.customermanager.oop;

public class Customer {
	private String name;
	private String gender;
	private String email;
	private int birthyear;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getBirthyear() {
		return birthyear;
	}


	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	@Override
	public String toString() {
		return "이름 : "+name+"\n성별 : "+gender+"\n이메일 : "+email+"\n출생년도 : "+birthyear;
	}
	
	public Customer() {
		
	}

	public Customer(String name, String gender, String email, int birthyear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthyear = birthyear;
	}
	
	

}
