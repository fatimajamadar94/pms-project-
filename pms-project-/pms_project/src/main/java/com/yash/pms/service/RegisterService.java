package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.EmployeeMaster;

public interface RegisterService {
	
	void saveRegister(EmployeeMaster employeeMaster);

	List<EmployeeMaster> getAllEmployee();
}
