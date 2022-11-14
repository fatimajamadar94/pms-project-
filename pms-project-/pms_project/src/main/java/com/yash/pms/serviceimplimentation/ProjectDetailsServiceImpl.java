package com.yash.pms.serviceimplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.ProjectDetailsDao;
import com.yash.pms.model.ProjectDetails;
import com.yash.pms.service.ProjectDetailsService;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService {

	@Autowired
	private ProjectDetailsDao projectDetailsDao;

	@Override
	public List<ProjectDetails> getAllProject() {
		// TODO Auto-generated method stub
		
		
		return projectDetailsDao.findAll();
	}

	@Override
	public ProjectDetails addProject(ProjectDetails projectDetails) {
		
		// TODO Auto-generated method stub
		
		return projectDetailsDao.save(projectDetails);
		
	}

	@Override
	public void updateProject(int projectId, ProjectDetails projectDetails) {

		
		Optional<ProjectDetails> proDetails=projectDetailsDao.findById(projectId);
		if(proDetails.isPresent()) {
			ProjectDetails  proDetails1=proDetails.get();
			proDetails1.setProjectId(projectId);
			proDetails1.setProjectName(projectDetails.getProjectName());
			proDetails1.setProjectDescription(projectDetails.getProjectDescription());
			proDetails1.setStartDate(projectDetails.getStartDate());
			proDetails1.setEndDate(projectDetails.getEndDate());
			proDetails1.setTechnology(projectDetails.getTechnology());
			proDetails1.setErDiagram(projectDetails.getErDiagram());
			proDetails1.setTeamSize(projectDetails.getTeamSize());
			projectDetailsDao.save(proDetails1);
			
		}else {
			System.out.println("Project Id Not found............");
		}
	}

	@Override
	public Optional<ProjectDetails> getProjectById(int projectId) {

		return projectDetailsDao.findById(projectId); 
	}

	@Override
	public void delete(int projectId) {
		projectDetailsDao.deleteById(projectId);
	}
}