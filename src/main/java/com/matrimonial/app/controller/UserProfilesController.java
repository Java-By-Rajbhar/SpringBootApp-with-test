package com.matrimonial.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrimonial.app.entity.UserProfiles;
import com.matrimonial.app.service.UserProfilesIService;

@RestController
@RequestMapping("/userProfile")
public class UserProfilesController {
	
	@Autowired
	UserProfilesIService userProfileIServices;
	@PutMapping("/regiserUser")
	public UserProfiles registerUser(@RequestBody UserProfiles userProfiles)
	{
		 return userProfileIServices.registerUser(userProfiles);
		
	
		
	}

}
