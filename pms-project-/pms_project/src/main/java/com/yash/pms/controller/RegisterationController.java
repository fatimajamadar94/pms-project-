package com.yash.pms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.service.RegisterService;

@RestController
@CrossOrigin
//@RequestMapping("/loginAndRegister")
public class RegisterationController {
	@Autowired
	RegisterService registerService;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/register")
	public String empRegisteration() {
		return "emp_register";
	}

	@PostMapping("/registration")
	public EmployeeMaster addCustomer(@RequestBody EmployeeMaster employeeMaster) throws Exception {
		EmployeeMaster emp1 = null;
		String tempEmail = employeeMaster.getEmailId();
		if (tempEmail != null && !"".equals(tempEmail)) {
			EmployeeMaster empObj = registerService.fetchCustomerByEmail(tempEmail);
			System.out.println("already exist" + empObj);
			if (empObj != null) {
				return empObj;
			} else {
				emp1 = registerService.addEmployee(employeeMaster);
				System.out.println("1" + emp1);
				return emp1;

			}
		}
		return emp1;
	}

	@GetMapping("/")
	public String login() {
		return "login";
	}

	@GetMapping("/logincheck/{username}/{password}")
	public HashMap logincheck(@PathVariable String username, @PathVariable String password) {
		EmployeeMaster emp = registerService.findByEmailAndPassword(username, password);
		System.out.println(username);
		System.out.println(password);
		HashMap hm = new HashMap();
		if (emp != null) {
			System.out.println(emp);
			hm.put("msg", "Login Successfully!");
			hm.put("Employee", emp);
		} else {
			System.out.println("username invalid>>" + username);
			System.out.println("password invalid>>" + password);
			System.out.println("invalid");
			hm.put("msg", "user invalid");
		}
		return hm;
	}

	@GetMapping("/getemployee")
	public List<EmployeeMaster> getAllRegisterEmployee(){
	System.out.println("list of emp");
		return registerService.getAllEmployee();
	
	
	}
}
