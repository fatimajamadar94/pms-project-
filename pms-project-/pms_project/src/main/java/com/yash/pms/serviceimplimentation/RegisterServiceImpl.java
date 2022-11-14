package com.yash.pms.serviceimplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yash.pms.dao.RegisterDao;
import com.yash.pms.model.DesignationMaster;
import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
@Autowired
RegisterDao registerDao;
	@Override
	public int saveRegister(EmployeeMaster employeeMaster) {
          EmployeeMaster a=registerDao.save(employeeMaster);
		return a.getEmpOfficialId();
	}
//	@Override
//	public EmployeeMaster UserLogin(String username, String password) {
//		// EmployeeMaster aa=registerDao.userLogin(username,password);
//		return null;
//	}
	@Override
	public EmployeeMaster fetchCustomerByEmail(String tempEmail) {
		EmployeeMaster emp=registerDao.findByEmail(tempEmail);
		return emp;
	}
	@Override
	public EmployeeMaster addEmployee(EmployeeMaster employeeMaster) {
		EmployeeMaster employee=new EmployeeMaster();
		employee.setEmpOfficialId(employeeMaster.getEmpOfficialId());
		employee.setEmailId(employeeMaster.getEmailId());
		employee.seteName(employeeMaster.geteName());
		employee.setUserName(employeeMaster.getEmailId());
		employee.setPassword("1234");
		employee.setEmpId(employeeMaster.getEmailId());
		employee.setBirthdate(employeeMaster.getBirthdate());
		employee.setGender(employeeMaster.getGender());
//		DesignationMaster designationMaster=new DesignationMaster();
//		designationMaster.setDesignId(employeeMaster.getDeptdepMaster().getDeptId());
		EmployeeMaster emp=registerDao.save(employee);
		return emp;
	}
	public EmployeeMaster findByEmailAndPassword(String username, String password) {
		EmployeeMaster emp=registerDao.findByEmailAndPassword(username,password);

		return emp;
	}
	@Override
	public List<EmployeeMaster> getAllEmployee() {
List<EmployeeMaster> list=registerDao.registerList();
return list;
	}
		@Override
	public void delete(EmployeeMaster employee) {
registerDao.delete(employee);		
	}

}
