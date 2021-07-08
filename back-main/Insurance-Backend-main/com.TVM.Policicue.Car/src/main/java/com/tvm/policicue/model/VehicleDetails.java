package com.tvm.policicue.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class VehicleDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String model;
	private Date date;
	private String policytype;
	private Boolean previousclaim;
	private String previousinsurer;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
	public Boolean getPreviousclaim() {
		return previousclaim;
	}
	public void setPreviousclaim(Boolean previousclaim) {
		this.previousclaim = previousclaim;
	}
	public String getPreviousinsurer() {
		return previousinsurer;
	}
	public void setPreviousinsurer(String previousinsurer) {
		this.previousinsurer = previousinsurer;
	}
	

}
