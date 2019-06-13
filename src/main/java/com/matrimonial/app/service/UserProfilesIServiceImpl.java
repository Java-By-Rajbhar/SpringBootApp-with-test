package com.matrimonial.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimonial.app.dao.UserProfilesIDao;
import com.matrimonial.app.entity.UserProfiles;
@Service
public class UserProfilesIServiceImpl implements UserProfilesIService {

	
	@Autowired
	UserProfilesIDao userProfileDao;
	
	
	@Override
	public UserProfiles registerUser(UserProfiles userProfiles) {
		
		  return userProfileDao.save(userProfiles);
	
	}


	@Override
	public List<UserProfiles> getProfileByCity(String city) {
		// TODO Auto-generated method stub
		return userProfileDao.findByCity(city);
	}


//	@Override
//	public List<UserProfiles> selection(String city, String age, String gender) {
//
//		if(city==null && age==null && gender ==null) {
//			
//		}
//		
//		return null;
//	}

}
