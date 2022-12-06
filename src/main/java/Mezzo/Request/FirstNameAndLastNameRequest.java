package Mezzo.Request;

import java.sql.Date;

public class FirstNameAndLastNameRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date startetDate;
	private int age;
	private boolean active;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getStartetDate() {
		return startetDate;
	}
	public void setStartetDate(Date startetDate) {
		this.startetDate = startetDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

   
}
