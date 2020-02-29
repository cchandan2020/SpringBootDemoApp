package com.tekbucket.demo.domain;

public class User {
	
	private String fullname;
	private String email;
	private String feedback;
	private boolean rated;
	private String gender;
	
	
	public User() {
		
	}
	
	
	
	public User(String fullname, String email, String feedback, boolean rated, String gender) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.feedback = feedback;
		this.rated = rated;
		this.gender = gender;
	}
	
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public boolean isRated() {
		return rated;
	}
	public void setRated(boolean rated) {
		this.rated = rated;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}


