package com.matrimonial.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimonial.app.entity.InterestShown;
@Repository
public interface InterestShownIDao extends JpaRepository<InterestShown, Integer> {
	
	public InterestShown findByFromIdAndTargetId(String fromId , String targetId );

}
