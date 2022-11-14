package com.yash.pms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DesignationMaster {
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int designId;
	private String designName;
	private String designDescp;
	
	
 public	DesignationMaster(){
		
	}


public int getDesignId() {
	return designId;
}


public void setDesignId(int designId) {
	this.designId = designId;
}


public String getDesignName() {
	return designName;
}


public void setDesignName(String designName) {
	this.designName = designName;
}


public String getDesignDescp() {
	return designDescp;
}


public void setDesignDescp(String designDescp) {
	this.designDescp = designDescp;
}

 
 
}
