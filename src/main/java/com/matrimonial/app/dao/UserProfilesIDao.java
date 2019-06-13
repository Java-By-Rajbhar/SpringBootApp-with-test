package com.matrimonial.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimonial.app.entity.UserProfiles;
@Repository
public interface UserProfilesIDao extends JpaRepository<UserProfiles, String> {
	
	public List<UserProfiles> findByCity(String city);
	public List<UserProfiles> findByAge(String age);
	public List<UserProfiles> findByGender(String gender);

	public List<UserProfiles> findByCityAndAge(String city,String age);
	public List<UserProfiles> findByCityAndAgeAndGender(String city,String age,String gender);
	public List<UserProfiles> findByAgeAndGender(String age,String gender);
	public List<UserProfiles> findByCityAndGender(String city,String gender);


}
