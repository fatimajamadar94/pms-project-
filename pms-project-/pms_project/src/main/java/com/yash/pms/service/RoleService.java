package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.RoleMaster;

public interface RoleService {

	
	public void saveRole(RoleMaster rm);

	public List<RoleMaster> getRole();

	
	
	
}
