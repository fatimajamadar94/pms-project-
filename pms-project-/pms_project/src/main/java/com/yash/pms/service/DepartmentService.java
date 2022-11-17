package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.DepartmentMaster;

public interface DepartmentService {

	
	public void saveDepartment(DepartmentMaster departmentMaster);

	public List<DepartmentMaster> getDepartment();
	
}
