package com.yash.pms.pmsService;

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

}
