package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.ProjectDetails;

public interface ProjectDetailsService {

	public List<ProjectDetails> getAllProject();

	public ProjectDetails addProject(ProjectDetails projectDetails);
	
	public void updateProject(int projectId, ProjectDetails  projectDetails);
	
}
