package com.yash.pms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class ProjectDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectId;
	private String projectName;
	private String projectDescription;
	private String technology;
	private String erDiagram;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private Date createdOn;
	private int teamSize;
	
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getErDiagram() {
		return erDiagram;
	}
	public void setErDiagram(String erDiagram) {
		this.erDiagram = erDiagram;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	public ProjectDetails() {
		super();
	}
	
	
	public ProjectDetails(int projectId, String projectName, String projectDescription, String technology,
			String erDiagram, Date startDate, Date endDate, Date createdOn, int teamSize) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.technology = technology;
		this.erDiagram = erDiagram;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdOn = createdOn;
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", technology=" + technology + ", erDiagram=" + erDiagram + ", startDate="
				+ startDate + ", endDate=" + endDate + ", createdOn=" + createdOn + ", teamSize=" + teamSize + "]";
	}
	



}

