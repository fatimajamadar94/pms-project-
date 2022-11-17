package com.yash.pms.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DesignationMaster {
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int designId;
	private String designName;
	private String designDescp;
//	@OneToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
//	private List<EmployeeMaster> list;
//	
 public	DesignationMaster(){
		
	}


//public List<EmployeeMaster> getList() {
//	return list;
//}
//
//
//public void setList(List<EmployeeMaster> list) {
//	this.list = list;
//}


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


@Override
public String toString() {
	return "DesignationMaster [designId=" + designId + ", designName=" + designName + ", designDescp=" + designDescp+"]";
}

 
 
}
