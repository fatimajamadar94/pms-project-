package com.yash.pms.serviceimplimentation;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.RoleDao;
import com.yash.pms.model.RoleMaster;
import com.yash.pms.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public void saveRole(RoleMaster rm) {
		// TODO Auto-generated method stub
		roleDao.save(rm);
	}

	@Override
	public List<RoleMaster> getRole() {
		// TODO Auto-generated method stub
		return roleDao.findAll();
	}

}
