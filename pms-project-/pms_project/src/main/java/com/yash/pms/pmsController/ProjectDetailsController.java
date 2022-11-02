package com.yash.pms.pmsController;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.yash.pms.model.ProjectDetails;
import com.yash.pms.pmsdao.ProjectDetailsRepository;

@Controller
public class ProjectDetailsController {
	
	@Autowired
	private ProjectDetailsRepository proDetailsRepo;

	@GetMapping("/")
	public String project(Model m) {
		
		List<ProjectDetails> list=proDetailsRepo.findAll();
		m.addAttribute("all_projects", list);
		
		return "index1";
	}
	
	
//	@GetMapping("/")
//	public String project() {
//		return "index";
//	}
	
	
	@GetMapping("/add")
	public String addProject() {
		return "add";
	}
	
	@GetMapping("/edit/{projectId}")
	public String editProject(@PathVariable(value="projectId") int id,Model m) {
		
		Optional<ProjectDetails> projectdetail=proDetailsRepo.findById(id);
		
		ProjectDetails pro=projectdetail.get();
		m.addAttribute("projectdetail", pro);
		return "edit";
	}
	
	@PostMapping("/save_project")
	public String saveProject(@ModelAttribute ProjectDetails projectdetails , HttpSession session) {
	
		proDetailsRepo.save(projectdetails);
		session.setAttribute("msg", "Project Add Successfully...");
		
		
		return "redirect:/add";
	}
	
	
	
	@PostMapping("/update_project")
	public String updateProject(@ModelAttribute ProjectDetails projectdetails , HttpSession session) {
	
		proDetailsRepo.save(projectdetails);
		
		session.setAttribute("msg", "Project updated Successfully...");
		
		
		return "redirect:/";
	}
	
	
	
}
