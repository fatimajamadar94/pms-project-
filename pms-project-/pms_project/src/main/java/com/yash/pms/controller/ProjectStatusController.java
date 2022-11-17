package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public void addProjectStatus(@RequestBody ProjectStatus projectStatus) {
	  
	  proStatusServiceImpl.addStatus(projectStatus);
	  
  }
	
	
	@GetMapping("/get")
	public List<ProjectStatus> getStatus(){
		
		return  proStatusServiceImpl.getProjectStatus();
	}
	
}
