package com.yash.pms.serviceimplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.DesignationDao;
import com.yash.pms.model.DesignationMaster;
import com.yash.pms.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService{

	
	@Autowired
	private DesignationDao designationDao;
	
	
	@Override
	public void saveDesignation(DesignationMaster designationMaster) {
		// TODO Auto-generated method stub
		designationDao.save(designationMaster);
	}


	@Override
	public List<DesignationMaster> getDesignation() {
		List<DesignationMaster> list= designationDao.findAll();
		return list;
	}


	@Override
	public void updateDesignation(int desingId, DesignationMaster designationMaster) {
		// TODO Auto-generated method stub
		
		Optional<DesignationMaster>   desingupdate=designationDao.findById(desingId);
		if(desingupdate.isPresent()) {
			DesignationMaster desingupdate1=desingupdate.get();
			desingupdate1.setDesignName(designationMaster.getDesignName());
			desingupdate1.setDesignDescp(designationMaster.getDesignDescp());
		}else {
			System.out.println("designation Id is not found............");
		}
			
	}

}
