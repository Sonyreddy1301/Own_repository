package com.n2s.miniproject.pojo;

public class StudentDetailPojo {
	
	private String id;
	private String fname;
	private String lname;
	private String email;
	private String Mobile;
	private String Course;
	private String Address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "StudentDetailPojo [fname=" + fname + ", lname=" + lname + ", email=" + email + ", Mobile=" + Mobile
				+ ", Course=" + Course + ", Address=" + Address + "]";
	}

}
