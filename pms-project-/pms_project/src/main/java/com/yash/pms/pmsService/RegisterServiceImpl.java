package com.yash.pms.pmsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.pmsdao.RegisterDao;

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
		EmployeeMaster emp=registerDao.save(employeeMaster);
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

}
