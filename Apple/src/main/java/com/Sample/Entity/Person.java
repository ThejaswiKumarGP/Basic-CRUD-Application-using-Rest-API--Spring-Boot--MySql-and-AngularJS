package com.Sample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;	
	
	public Person(Long id) {
		this.id = id;
	}
	
	@Column(name = "name")
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "mobile")
    private String PhoneNo;

    private transient String confirmPassword;
	
	public Person(String name, String email, String password, String PhoneNo) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.PhoneNo = PhoneNo;		
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEmail() {
		return email;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	public String getConfirmPassword() {
	        return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
	        this.confirmPassword = confirmPassword;
	}
}
