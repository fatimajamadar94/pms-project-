package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.ProjectStatus;

public interface ProjectStatusService {

	
	public void addStatus(ProjectStatus projectStatus);
	
	public List<ProjectStatus> getProjectStatus();

	void getStatus();
}
