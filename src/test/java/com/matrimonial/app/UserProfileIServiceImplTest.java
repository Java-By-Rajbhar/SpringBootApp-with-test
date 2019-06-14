package com.matrimonial.app;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testgetProfileByCity() {
		
		UserProfiles userProfile =new UserProfiles("deep123", "123", "deepika", "salem", "female", 49, "obc");
		UserProfiles userProfile2 =new UserProfiles("deep124", "123", "deepika", "salem", "female", 49, "obc");
		UserProfiles userProfile3 =new UserProfiles("deep125", "123", "deepika", "salem", "female", 49, "obc");

		List<UserProfiles> userprofileList=new ArrayList<UserProfiles>();
		userprofileList.add(userProfile);
		userprofileList.add(userProfile2);
		userprofileList.add(userProfile3);

		Mockito.when(userProfilesIDao.findByCity(userProfile.getCity())).thenReturn(userprofileList);
		
		List<UserProfiles> actualProfiles=userProfileIServiceImpl.getProfileByCity(userProfile.getCity());
		System.out.println("act ="+actualProfiles.size());
//		System.out.println("act ="+actualProfiles.size());

		Assert.assertEquals(userprofileList, actualProfiles);
	}
	
	
	@Test
	public void testNegativegetProfileByCity() {
		
		UserProfiles userProfile =new UserProfiles("deep123", "123", "deepika", "salem", "female", 49, "obc");
		UserProfiles userProfile2 =new UserProfiles("deep124", "123", "deepika", "salem", "female", 49, "obc");
		UserProfiles userProfile3 =new UserProfiles("deep125", "123", "deepika", "salem", "female", 49, "obc");

		List<UserProfiles> userprofileList=new ArrayList<UserProfiles>();
		userprofileList.add(userProfile);
		userprofileList.add(userProfile2);
		userprofileList.add(userProfile3);

		
		Mockito.when(userProfilesIDao.findByCity("jhgjs")).thenReturn(userprofileList);
		
		List<UserProfiles> actualProfiles=userProfileIServiceImpl.getProfileByCity(userProfile.getCity());
//		Assert.assertEquals(userprofileList, actualProfiles);
		Assert.assertNotEquals(userprofileList, actualProfiles);
	}

}
