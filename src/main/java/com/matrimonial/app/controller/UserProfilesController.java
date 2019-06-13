package com.matrimonial.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrimonial.app.entity.UserProfiles;
import com.matrimonial.app.service.InterestedShownIService;
import com.matrimonial.app.service.UserProfilesIService;

@RestController
@RequestMapping("/userProfile")
public class UserProfilesController {
	
	@Autowired
	UserProfilesIService userProfileIServices;
	@Autowired InterestedShownIService interestedShownIService;
	@PostMapping("/regiserUser")
	public UserProfiles registerUser(@RequestBody UserProfiles userProfiles)
	{
		 return userProfileIServices.registerUser(userProfiles);
		
	
		
	}
	
	
	@PostMapping("/ineterested/{from}/{target}")
	public String interested(@PathVariable("from") String fromId, @PathVariable("target") String targetId)
	{
		
	
		return interestedShownIService.interestProfiles(fromId, targetId);
	}
	
	
	@PutMapping("/update/{from}/{target}/{status}")
	public String updateTargetStatus(@PathVariable("from") String fromId, @PathVariable("target") String targetId, @PathVariable("status") String status)
	{
		
	
		return interestedShownIService.interestProfilesUpadte(fromId, targetId, status);
	}
	@GetMapping("/getByCity/{city}")
	public List<UserProfiles> searchProfileByCity(@PathVariable String city)
	{
		return userProfileIServices.getProfileByCity(city);
	}

}
