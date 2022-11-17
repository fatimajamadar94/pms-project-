package com.yash.pms.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Attendance {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int attenId;
	private Date attenDate;
	private String statusOfDay;
	private int workDuration;
	private Date createdOn;
	private String attenStatus;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private EmployeeMaster employeeMaster;
	
	
	
	public Attendance() {
		
	}



	public Attendance(int attenId, Date attenDate, String statusOfDay, int workDuration, Date createdOn,
			String attenStatus, EmployeeMaster employeeMaster) {
		super();
		this.attenId = attenId;
		this.attenDate = attenDate;
		this.statusOfDay = statusOfDay;
		this.workDuration = workDuration;
		this.createdOn = createdOn;
		this.attenStatus = attenStatus;
		this.employeeMaster = employeeMaster;
	}



	public int getAttenId() {
		return attenId;
	}



	public void setAttenId(int attenId) {
		this.attenId = attenId;
	}



	public Date getAttenDate() {
		return attenDate;
	}



	public void setAttenDate(Date attenDate) {
		this.attenDate = attenDate;
	}



	public String getStatusOfDay() {
		return statusOfDay;
	}



	public void setStatusOfDay(String statusOfDay) {
		this.statusOfDay = statusOfDay;
	}



	public int getWorkDuration() {
		return workDuration;
	}



	public void setWorkDuration(int workDuration) {
		this.workDuration = workDuration;
	}



	public Date getCreatedOn() {
		return createdOn;
	}



	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



	public String getAttenStatus() {
		return attenStatus;
	}



	public void setAttenStatus(String attenStatus) {
		this.attenStatus = attenStatus;
	}



	public EmployeeMaster getEmployeeMaster() {
		return employeeMaster;
	}



	public void setEmployeeMaster(EmployeeMaster employeeMaster) {
		this.employeeMaster = employeeMaster;
	}



	@Override
	public String toString() {
		return "Attendance [attenId=" + attenId + ", attenDate=" + attenDate + ", statusOfDay=" + statusOfDay
				+ ", workDuration=" + workDuration + ", createdOn=" + createdOn + ", attenStatus=" + attenStatus
				+ ", employeeMaster=" + employeeMaster + "]";
	}
	
	
}
