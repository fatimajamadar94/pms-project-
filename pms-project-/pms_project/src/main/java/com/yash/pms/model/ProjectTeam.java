package com.yash.pms.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProjectTeam {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teamId;
	@ManyToOne(fetch=FetchType.LAZY)
	private ProjectDetails projectDetails;
	@ManyToOne(fetch=FetchType.LAZY)
    private EmployeeMaster employeeMaster;	
	
	ProjectTeam(){
		
	}
	
	
	public ProjectTeam(Integer teamId, ProjectDetails projectDetails, EmployeeMaster employeeMaster) {
		super();
		this.teamId = teamId;
		this.projectDetails = projectDetails;
		this.employeeMaster = employeeMaster;
	}





	public Integer getTeamId() {
		return teamId;
	}


	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}


	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}


	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}


	public EmployeeMaster getEmployeeMaster() {
		return employeeMaster;
	}


	public void setEmployeeMaster(EmployeeMaster employeeMaster) {
		this.employeeMaster = employeeMaster;
	}


	@Override
	public String toString() {
		return "ProjectTeam [teamId=" + teamId + ", projectDetails=" + projectDetails + ", employeeMaster="
				+ employeeMaster + "]";
	}
	
	
	
	
	
}
