package com.yash.pms.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ProjectStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectStatusId;
	private String workStatus;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JsonIgnore
	private ProjectTeam projectTeam;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JsonIgnore
	private EmployeeMaster employeeMaster;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdOn;

	
	
	ProjectStatus(){
		
	}



	public ProjectStatus(int projectStatusId, String workStatus, ProjectTeam projectTeam, EmployeeMaster employeeMaster,
			Date createdOn) {
		super();
		this.projectStatusId = projectStatusId;
		this.workStatus = workStatus;
		this.projectTeam = projectTeam;
		this.employeeMaster = employeeMaster;
		this.createdOn = createdOn;
	}



	public int getProjectStatusId() {
		return projectStatusId;
	}


	public void setProjectStatusId(int projectStatusId) {
		this.projectStatusId = projectStatusId;
	}


	public String getWorkStatus() {
		return workStatus;
	}


	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}


	public ProjectTeam getProjectTeam() {
		return projectTeam;
	}


	public void setProjectTeam(ProjectTeam projectTeam) {
		this.projectTeam = projectTeam;
	}


	public EmployeeMaster getEmployeeMaster() {
		return employeeMaster;
	}


	public void setEmployeeMaster(EmployeeMaster employeeMaster) {
		this.employeeMaster = employeeMaster;
	}

	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



	@Override
	public String toString() {
		return "ProjectStatus [projectStatusId=" + projectStatusId + ", workStatus=" + workStatus + ", projectTeam="
				+ projectTeam + ", employeeMaster=" + employeeMaster + ", createdOn=" + createdOn + "]";
	}




	
	
	
	
}
