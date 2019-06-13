package com.matrimonial.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTRESTSHOWN")
public class InterestShown {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int intrestedId;
	private String fromId;
	private String targetId;
	private String date;
	private String targetIdInterest;
	private String fromIdInterest;

	
	public String getTargetIdInterest() {
		return targetIdInterest;
	}
	public void setTargetIdInterest(String targetIdInterest) {
		this.targetIdInterest = targetIdInterest;
	}
	public String getFromIdInterest() {
		return fromIdInterest;
	}
	public void setFromIdInterest(String fromIdInterest) {
		this.fromIdInterest = fromIdInterest;
	}
	public int getIntrestedId() {
		return intrestedId;
	}
	public void setIntrestedId(int intrestedId) {
		this.intrestedId = intrestedId;
	}
	public String getFromId() {
		return fromId;
	}
	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	public String getTargetId() {
		return targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
