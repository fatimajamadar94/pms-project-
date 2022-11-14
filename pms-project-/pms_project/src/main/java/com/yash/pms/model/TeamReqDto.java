package com.yash.pms.model;

import java.util.List;

public class TeamReqDto {
	
	private ProjectDetails projectDetails;
	private List<EmployeeMaster> list;
	private Integer projectId;
	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}
	public List<EmployeeMaster> getList() {
		return list;
	}
	public void setList(List<EmployeeMaster> list) {
		this.list = list;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public TeamReqDto() {
		super();
	}

}
