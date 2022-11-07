package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.RoleMaster;
import com.yash.pms.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	@PostMapping("/save")
	public int addRole(@RequestBody RoleMaster rm) {
		roleService.saveRole(rm);
		return rm.getRoleId();
	}
	
	@GetMapping("/get")
	public List<RoleMaster> getRole() {
		return roleService.getRole();
	}
}
