package com.matrimonial.app.service;

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

}
