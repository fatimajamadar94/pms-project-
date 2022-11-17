package com.yash.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.DesignationMaster;
import com.yash.pms.service.DesignationService;



@RestController
@RequestMapping("/designation")
@CrossOrigin("*")
public class DesignationController {

	@Autowired
	private DesignationService designationService;
	
	@PostMapping("/save")
	public void addDesignation(@RequestBody DesignationMaster designationMaster) {
		designationService.saveDesignation(designationMaster);
	}
	
	@GetMapping("/getdesignationList")
	public List<DesignationMaster> getDesignation() {
		return designationService.getDesignation();
	}
	
	@PutMapping("/updatedesign/{designId}")
	public void updateDesignation(@PathVariable("designId") int designId , @RequestBody DesignationMaster designationMaster) {
		designationService.updateDesignation(designId, designationMaster);
	}
	
	@GetMapping("/getdesignbyid/{designId}")
	public Optional<DesignationMaster> getDesignById(@PathVariable("designId") int designId){
		
		return designationService.getDesignationById(designId);
	}
	
}
