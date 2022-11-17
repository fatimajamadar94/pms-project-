package com.yash.pms.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.ProjectStatusDao;
import com.yash.pms.model.ProjectStatus;
import com.yash.pms.service.ProjectStatusService;

@Service
public class ProjectStatusServiceImpl implements ProjectStatusService{

	
	@Autowired
	private ProjectStatusDao projectStatusDao;
	
	@Override
	public void addStatus(ProjectStatus projectStatus) {
		// TODO Auto-generated method stub
		
		projectStatusDao.save(projectStatus);
		
	}

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		
	}

}
