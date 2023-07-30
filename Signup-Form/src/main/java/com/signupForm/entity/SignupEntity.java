package com.signupForm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Signup_User",
		uniqueConstraints = @UniqueConstraint(name="mailId_And_phoneNumber_Constraint", columnNames = { "Mail_Id","Phone_Number" }))
public class SignupEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_Id")
	private long id;
	@Column(name="First_Name",nullable=false)
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Password",nullable=false)
	private String password;
	@Column(name="Mail_Id",nullable=false)
	private String mailId;
	@Column(name="Phone_Number",nullable=false)
	private long phoneNumber;
	@Column(name="Address")
	private String address;
	@Column(name="Pincode",nullable=false)
	private long pincode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}
