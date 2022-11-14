package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.ProjectDetails;
import com.yash.pms.service.ProjectDetailsService;

@RestController
@RequestMapping("/projectdetails")
@CrossOrigin("*")
public class ProjectDetailsController {
	
	@Autowired
	private ProjectDetailsService projectDetailsService;
	
	
	@GetMapping("/getproject")
	public List<ProjectDetails> getAllProjectDetails(){
		
		return projectDetailsService.getAllProject();
	}
	
	
	@PostMapping("/addproject")
	public ProjectDetails addProjectDetails(@RequestBody ProjectDetails projectDetails) {
			ProjectDetails projectDetails2=projectDetailsService.addProject(projectDetails);
			return projectDetails;
		 
	}
	
	@PutMapping("/updateproject/{projectId}")
	public void updateProject(@PathVariable("projectId") int projectId , @RequestBody ProjectDetails projectDetails) {
		projectDetailsService.updateProject(projectId, projectDetails);
	}

	
		
}
