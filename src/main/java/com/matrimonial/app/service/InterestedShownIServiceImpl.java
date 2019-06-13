package com.matrimonial.app.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimonial.app.dao.InterestShownIDao;
import com.matrimonial.app.dao.UserProfilesIDao;
import com.matrimonial.app.entity.InterestShown;

@Service
public class InterestedShownIServiceImpl implements InterestedShownIService {

	@Autowired InterestShownIDao interestedShownDao;
	@Autowired UserProfilesIDao  userProfilesIDao;
	@Override
	public String interestProfiles(String fromId, String targetId) {
		
		if(userProfilesIDao.findOne(fromId)==null || userProfilesIDao.findOne(targetId)==null) {
			return "prfiles are invalid";

		}else {
			
			if(interestedShownDao.findByFromIdAndTargetId(fromId, targetId)==null) {
			
			InterestShown interestedShown=new InterestShown();
			interestedShown.setDate((new Date()).toString());
			interestedShown.setFromId(fromId);
			interestedShown.setTargetId(targetId);
			interestedShown.setFromIdInterest("Y");
			interestedShownDao.save(interestedShown);
			
			return "success";

			}else {
				
				return "already requested";

			}
			
		}
	}
	@Override
	public String interestProfilesUpadte(String fronId, String targetId, String status) {

	InterestShown interestShown = interestedShownDao.findByFromIdAndTargetId(fronId, targetId);
	if(interestShown==null) {
		return "details are miss match";
	}
	else {
		interestShown.setTargetIdInterest(status);
		interestedShownDao.save(interestShown);
		return status+" for "+targetId+" updated successfully";

	}
	}
	

}
