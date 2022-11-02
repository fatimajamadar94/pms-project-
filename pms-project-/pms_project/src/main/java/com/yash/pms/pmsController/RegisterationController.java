package com.yash.pms.pmsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.pmsService.RegisterService;

@Controller
@RequestMapping("/login")
public class RegisterationController {
	@Autowired
	RegisterService registerService;
	
	@RequestMapping("/index")
	 public String index()
	 {
		 return "index";
	 }
	 @RequestMapping("/register")
	 public String empRegisteration()
	 {
		 return "emp_register";
	 }

	 @RequestMapping(value="/saveEmpReg",method=RequestMethod.POST)
	 public String saveStudent(@ModelAttribute EmployeeMaster employeeMaster)
	 {
		int id = registerService.saveRegister(employeeMaster);
		System.out.println("id"+id);
		if(id>0)
		 return "redirect:/index";
		else
			return "emp_register";
	 }
	 
	 
}
