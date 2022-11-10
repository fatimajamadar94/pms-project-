package com.yash.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.service.EmployeeLoginService;

@RestController
@RequestMapping("/login")
public class EmployeeLoginController {

	
	
	@Autowired
	private EmployeeLoginService employeeLoginService;
	
	
//	@PostMapping("/savelogin")
//	public void saveemployeelogin(EmployeeMaster employeeMaster) {
//
//		employeeLoginService.saveEmployeeLogin(employeeMaster);
//	}
//	
//	
}
