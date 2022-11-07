package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterationController {
	
	
	@Autowired
  private	RegisterService registerService;
	
	
	@PostMapping("/saveemployee")
	public void registerEmployee(@RequestBody EmployeeMaster employeeMaster) {
		registerService.saveRegister(employeeMaster);
	}
	
	
	@GetMapping("/getallemployee")
	public List<EmployeeMaster> getAllRegisterEmployee(){
		return registerService.getAllEmployee();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
//	@Autowired
//	RegisterService registerService;
//	
//	@RequestMapping("/index")
//	 public String index()
//	 {
//		 return "index";
//	 }
//	 @RequestMapping("/register")
//	 public String empRegisteration()
//	 {
//		 return "emp_register";
//	 }
//
//	 @RequestMapping(value="/saveEmpReg",method=RequestMethod.POST)
//	 public String saveStudent(@ModelAttribute EmployeeMaster employeeMaster)
//	 {
//		int id = registerService.saveRegister(employeeMaster);
//		System.out.println("id"+id);
//		if(id>0)
//		 return "redirect:/index";
//		else
//			return "emp_register";
//	 }
//	 
	 
}
