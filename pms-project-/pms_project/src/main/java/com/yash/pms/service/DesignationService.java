package com.yash.pms.service;

import java.util.List;
import java.util.Optional;

import com.yash.pms.model.DesignationMaster;

public interface DesignationService {

	public void saveDesignation(DesignationMaster designationMaster);

	public List<DesignationMaster> getDesignation();
	
	public void updateDesignation(int desingId, DesignationMaster designationMaster);
	
	public Optional<DesignationMaster> getDesignationById(int designId);
}
