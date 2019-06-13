package com.matrimonial.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.matrimonial.app.dao.UserProfilesIDao;
import com.matrimonial.app.entity.UserProfiles;
import com.matrimonial.app.service.UserProfilesIServiceImpl;



@RunWith(MockitoJUnitRunner.class)

public class UserProfileIServiceImplTest {
	
	@Mock
	UserProfilesIDao userProfilesIDao;
	
	@InjectMocks
	UserProfilesIServiceImpl userProfileIServiceImpl;
	
	@Test
	public void test1RegisterUser() 
	{
		UserProfiles userProfile =new UserProfiles("deep123", "123", "deepika", "salem", "female", 49, "obc");
		Mockito.when(userProfilesIDao.save(userProfile)).thenReturn(userProfile);
		UserProfiles actualVal=userProfileIServiceImpl.registerUser(userProfile);
		Assert.assertEquals(userProfile, actualVal);
		
	}

	@Test
	public void test2RegisterUser() 
	{
		UserProfiles userProfile =new UserProfiles("deep123", "123", "deepika", "salem", "female", 49, "obc");
		Mockito.when(userProfilesIDao.save(userProfile)).thenReturn(userProfile);
		UserProfiles actualVal=userProfileIServiceImpl.registerUser(userProfile);
		Assert.assertEquals(userProfile, actualVal);
		
	}
	

}
