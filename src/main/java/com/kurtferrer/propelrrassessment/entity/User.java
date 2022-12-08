package com.kurtferrer.propelrrassessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Pattern.Flag;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Fullname is required.")
	@Pattern(regexp="^[a-zA-Z ,.\s]*$", message="Fullname must be character, spaces, periods and commas only.")
	private String fullname;
	
	@NotBlank(message = "Email is required.")
	@Email(message = "The email address is invalid.", flags = { Flag.CASE_INSENSITIVE })
	private String email;
	
	@NotBlank(message = "Mobile number is required.")
	@Size(min=11,max=11, message="Mobile number should be exactly 11 digits")
	@Pattern(regexp="^(09)[0-9]*$",message="Mobile number must be in ph format.")
	private String mobile_number;
	
	
	@NotBlank(message = "Birthday is required.")
	private String birthdate;
	
	private int age;
	
	@NotBlank(message = "The city is required.")
	private String gender;


	
	public User() {
	}



	public User(String fullname, String email, String mobile_number, String birthdate, String gender, int age) {
		this.fullname = fullname;
		this.email = email;
		this.mobile_number = mobile_number;
		this.birthdate = birthdate;
		this.gender = gender;
		this.age = age;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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



	public String getMobile_number() {
		return mobile_number;
	}



	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}



	public String getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}



	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
