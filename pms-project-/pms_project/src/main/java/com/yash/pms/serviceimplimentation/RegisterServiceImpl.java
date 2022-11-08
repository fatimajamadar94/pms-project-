package com.yash.pms.serviceimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yash.pms.dao.RegisterDao;
import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	
@Autowired
 private RegisterDao registerDao;

@Override
public void saveRegister(EmployeeMaster employeeMaster) {
	 registerDao.save(employeeMaster);
}


@Override
public List<EmployeeMaster> getAllEmployee() {
	
	return registerDao.findAll();
}


//    @Override
//	public int saveRegister(EmployeeMaster employeeMaster) {
//            EmployeeMaster a=registerDao.save(employeeMaster);
//		return a.getEmpOfficialId();
//	}

    
}
