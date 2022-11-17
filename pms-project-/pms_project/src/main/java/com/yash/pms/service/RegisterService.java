package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.EmployeeMaster;


public interface RegisterService {
	
	int saveRegister(EmployeeMaster employeeMaster);

	//EmployeeMaster UserLogin(String username, String password);

	EmployeeMaster fetchCustomerByEmail(String tempEmail);

	EmployeeMaster addEmployee(EmployeeMaster employeeMaster);

	EmployeeMaster findByEmailAndPassword(String username, String password);

	List<EmployeeMaster> getAllEmployee();

	void delete(EmployeeMaster employee);

	List<EmployeeMaster> getActiveEmployee();



}
