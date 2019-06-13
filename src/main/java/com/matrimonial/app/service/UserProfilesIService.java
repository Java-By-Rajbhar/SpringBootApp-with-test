package com.matrimonial.app.service;

import java.util.List;

import com.matrimonial.app.entity.UserProfiles;

public interface UserProfilesIService {
	
	public UserProfiles registerUser(UserProfiles userProfiles);
	
	public List<UserProfiles> getProfileByCity(String city);
	
//	public Object selection(String city, String age, String gender);

}
