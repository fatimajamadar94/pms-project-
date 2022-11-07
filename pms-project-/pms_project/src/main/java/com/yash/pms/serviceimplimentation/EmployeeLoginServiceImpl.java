package com.yash.pms.serviceimplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.EmployeeLoginDao;
import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.service.EmployeeLoginService;

@Service
public class EmployeeLoginServiceImpl implements EmployeeLoginService{

	@Autowired 
	private EmployeeLoginDao employeeLoginDao;
	
//	@Override
//	public void saveEmployeeLogin(EmployeeMaster employeelogin,int emailId) {
//
////		EmployeeMaster	employeelogin1=employeelogin.getEmailId(emp)
////		employeelogin.s
////		EmployeeMaster empLogin =(EmployeeMaster)employeelogin.getEmpId();
////		String empPassword = employeelogin.getPassword();
//		
//		
//		Optional<EmployeeMaster> op = employeeLoginDao.findById(emailId);
//		{
//		
//			if(op.isPresent()) {
//				
//			}
//		
//	}
////
//	@Override
//	public List<EmployeeMaster> getAllLoginDetails() {
//		return ;
//	}
//	

}
