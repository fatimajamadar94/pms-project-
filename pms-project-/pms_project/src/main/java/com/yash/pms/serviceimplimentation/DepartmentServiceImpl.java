package com.yash.pms.serviceimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.DepartmentDao;
import com.yash.pms.model.DepartmentMaster;
import com.yash.pms.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public void saveDepartment(DepartmentMaster departmentMaster) {
		// TODO Auto-generated method stub
		departmentDao.save(departmentMaster);
	}

	@Override
	public List<DepartmentMaster> getDepartment() {
		// TODO Auto-generated method stub
		return departmentDao.findAll();
	}

}
