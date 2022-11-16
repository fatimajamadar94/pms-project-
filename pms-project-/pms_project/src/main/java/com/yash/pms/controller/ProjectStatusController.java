package com.yash.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.ProjectStatus;
import com.yash.pms.serviceimplimentation.ProjectStatusServiceImpl;

@RestController
@RequestMapping("/status")
@CrossOrigin("*")
public class ProjectStatusController {

	@Autowired
	private ProjectStatusServiceImpl proStatusServiceImpl;
	
	
	@PostMapping("/add")
    public void addProjectStatus(ProjectStatus projectStatus) {
	  
	  proStatusServiceImpl.addStatus(projectStatus);
	  
  }
	
	
	
	
	
}
