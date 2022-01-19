package com.lavanya.gudimella.SpringBootMongoDBDemo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "employee_details")
public class Employee {

	@Id
	@Field(name = "_id")
	private ObjectId employee_id;

	@Field(name = "First_Name")
	private String first_name;

	@Field(name = "Last_Name")
	private String last_name;

	@Field(name = "Date_Of_Birth")
	private String dob;

	@Field(name = "e_mail")
	private String email;

	@Field(name = "phone")
	private String phone_number;

	public ObjectId getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(ObjectId employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", dob=" + dob + ", email=" + email + ", phone_number=" + phone_number + "]";
	}
}
