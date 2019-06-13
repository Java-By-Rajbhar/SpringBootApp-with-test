package com.matrimonial.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERPROFILES")
public class UserProfiles {

	
	@Id
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	private String password;
	private String name;
	public UserProfiles(String userId, String password, String name, String city, String gender, int age, String cast) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.age = age;
		this.cast = cast;
	}
	private String city;
	private String gender;
	private int age;
	private String cast;
	

}
