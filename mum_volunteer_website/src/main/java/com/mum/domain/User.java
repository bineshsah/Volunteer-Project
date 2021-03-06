package com.mum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String userName;
	@Column
	private String passWord;
	@Column
	private String userType;
	
	@Column
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@OneToOne(mappedBy="user")
	private Volunteer volunteer;

	public Volunteer getVolunteer() {
		return volunteer;
	}
	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}
	public String getUserType() {
		return userType;
	}
	public User(){
		
	}

	public User(String userName, String passWord, String userType,String email) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
		this.email=email;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", userType=" + userType
				+ ", volunteer=" + volunteer + "]";
	}
	

}
