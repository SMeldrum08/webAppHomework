package com.example.j2eeapp.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.lang.Math;

import com.example.j2eeapp.commons.domain.BaseEntity;


@Entity
@Table(name="appstudent")
public class StudentEntity extends BaseEntity{
	
	/**
	 * Attempt of creating a student entity for its own database, things to consider:
	 * how to create the username so it is unique?
	 * how to generate a random password (a selection from a small array would be good enough for now) -- may have done through random array selection
	 * how to pull through the creator username (probably by sending it when they click create)
	 * (need to run the sql to create the database)
	 */
	private static final long serialVersionUID = 5211680592412307619L;
	private String firstName;
	private String lastName;
	private String className;
	private String userName;
	private String password;
	private String creatorName;
	
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName() {
		this.userName = getFirstName() + getLastName();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword() {
		String [] passwordArray = {
				"pass1","pass2","pass3","pass4","pass5","pass6"
		};
		this.password = passwordArray[(int )(Math.random()*5)];
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = "temporary";
	}
	

}
