package com.yash.pms.service;

import java.util.List;
import java.util.Optional;

import com.yash.pms.model.ProjectDetails;

public interface ProjectDetailsService {

	public List<ProjectDetails> getAllProject();

	public void addProject(ProjectDetails projectDetails);
	
	public void updateProject(int projectId, ProjectDetails  projectDetails);
	
	public Optional<ProjectDetails> getProjectById(int projectId);
	
	public void delete(int projectId);
}
