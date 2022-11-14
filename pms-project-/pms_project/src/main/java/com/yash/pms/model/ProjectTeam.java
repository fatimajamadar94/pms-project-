package com.yash.pms.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ProjectTeam {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teamId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JsonIgnoreProperties("comment")
	private ProjectDetails projectDetails;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JsonIgnoreProperties("comment")

    private EmployeeMaster employeeMaster;	
	
	public ProjectTeam(){
		
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
