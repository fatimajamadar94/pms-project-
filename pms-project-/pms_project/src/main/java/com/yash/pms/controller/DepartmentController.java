package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.DepartmentMaster;
import com.yash.pms.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/save")
	public void addDepartment(@RequestBody DepartmentMaster departmentMaster) {
		departmentService.saveDepartment(departmentMaster);
	}
	@GetMapping("/get")
	public List<DepartmentMaster> getDepartment() {
		return departmentService.getDepartment();
	}
}
