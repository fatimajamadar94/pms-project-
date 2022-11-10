package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class ProjectDetailsController {
	
	@Autowired
	private ProjectDetailsService projectDetailsService;
	
	
	@GetMapping("/getproject")
	public List<ProjectDetails> getAllProjectDetails(){
		
		return projectDetailsService.getAllProject();
	}
	
	
	@PostMapping("/addproject")
	public void addProjectDetails(@RequestBody ProjectDetails projectDetails) {
		
			projectDetailsService.addProject(projectDetails);
		 
	}
	
	@PutMapping("/updateproject/{projectId}")
	public void updateProject(@PathVariable("projectId") int projectId , @RequestBody ProjectDetails projectDetails) {
		projectDetailsService.updateProject(projectId, projectDetails);
	}

	
	
	
	

//	@GetMapping("/")
//	public String project(Model m) {
//		
//		List<ProjectDetails> list=proDetailsRepo.findAll();
//		m.addAttribute("all_projects", list);
//		
//		return "index1";
//	}
//	
//	
////	@GetMapping("/")
////	public String project() {
////		return "index";
////	}
//	
//	
//	@GetMapping("/add")
//	public String addProject() {
//		return "add";
//	}
//	
//	@GetMapping("/edit/{projectId}")
//	public String editProject(@PathVariable(value="projectId") int id,Model m) {
//		
//		Optional<ProjectDetails> projectdetail=proDetailsRepo.findById(id);
//		
//		ProjectDetails pro=projectdetail.get();
//		m.addAttribute("projectdetail", pro);
//		return "edit";
//	}
//	
//	@PostMapping("/save_project")
//	public String saveProject(@ModelAttribute ProjectDetails projectdetails , HttpSession session) {
//	
//		proDetailsRepo.save(projectdetails);
//		session.setAttribute("msg", "Project Add Successfully...");
//		
//		
//		return "redirect:/add";
//	}
//	
//	
//	
//	@PostMapping("/update_project")
//	public String updateProject(@ModelAttribute ProjectDetails projectdetails , HttpSession session) {
//	
//		proDetailsRepo.save(projectdetails);
//		
//		session.setAttribute("msg", "Project updated Successfully...");
//		
//		
//		return "redirect:/";
//	}
//	
//	
	
}