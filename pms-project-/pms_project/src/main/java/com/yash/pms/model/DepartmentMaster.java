package com.yash.pms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentMaster {

	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptName;
	private String deptDescp;
	
	public DepartmentMaster(){
		
	}
	
	
	
	public DepartmentMaster(int deptId, String deptName, String deptDescp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptDescp = deptDescp;
	}





	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDescp() {
		return deptDescp;
	}
	public void setDeptDescp(String deptDescp) {
		this.deptDescp = deptDescp;
	}

	
	@Override
	public String toString() {
		return "DepartmentMaster [deptId=" + deptId + ", deptName=" + deptName + ", deptDescp=" + deptDescp + "]";
	}

	
	

}
