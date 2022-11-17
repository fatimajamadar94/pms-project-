package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.ProjectTeam;
import com.yash.pms.service.CreateTeamService;

@RestController
@CrossOrigin("*")
public class CreateTeamController {
	@Autowired
	private CreateTeamService createTeamService;
	
	
	
	  @GetMapping("/getTeam") public List<ProjectTeam>
	 getAllProjectDetails(){
	  return createTeamService.getAllTeam(); 
	  }
	 
	
	
	@PostMapping("/createteam")
	public String addTeam(@RequestBody ProjectTeam projeTeam) {
		String team=createTeamService.addTeam(projeTeam);
		System.out.println(team);
			return team;
		 
	}
	
//	@PutMapping("/updateproject/{projectId}")
//	public void updateProject(@PathVariable("projectId") int projectId , @RequestBody ProjectDetails projectDetails) {
//		projectDetailsService.updateProject(projectId, projectDetails);
//	}

}
