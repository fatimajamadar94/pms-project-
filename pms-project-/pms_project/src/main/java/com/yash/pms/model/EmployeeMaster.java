package com.yash.pms.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class EmployeeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empOfficialId;
	private String ename;
	private String emailId;
	private String empId;
	private Integer phone;
	private Date joiningDate;
	private Date createdDate;
	private Date updatedDate;
	private String userName;
	private String password;
	private String empProjectStatus;
	@ManyToOne(fetch = FetchType.LAZY)
	private DepartmentMaster deptdepMaster;
	@ManyToOne(fetch = FetchType.LAZY)
	private DesignationMaster designationMaster;
	@ManyToOne(fetch = FetchType.LAZY)
	private RoleMaster roleMaster;
	public Integer getEmpOfficialId() {
		return empOfficialId;
	}
	public void setEmpOfficialId(Integer empOfficialId) {
		this.empOfficialId = empOfficialId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmpProjectStatus() {
		return empProjectStatus;
	}
	public void setEmpProjectStatus(String empProjectStatus) {
		this.empProjectStatus = empProjectStatus;
	}
	public DepartmentMaster getDeptdepMaster() {
		return deptdepMaster;
	}
	public void setDeptdepMaster(DepartmentMaster deptdepMaster) {
		this.deptdepMaster = deptdepMaster;
	}
	public DesignationMaster getDesignationMaster() {
		return designationMaster;
	}
	public void setDesignationMaster(DesignationMaster designationMaster) {
		this.designationMaster = designationMaster;
	}
	public RoleMaster getRoleMaster() {
		return roleMaster;
	}
	public void setRoleMaster(RoleMaster roleMaster) {
		this.roleMaster = roleMaster;
	}
	public EmployeeMaster(Integer empOfficialId, String ename, String emailId, String empId, Integer phone,
			Date joiningDate, Date createdDate, Date updatedDate, String userName, String password,
			String empProjectStatus, DepartmentMaster deptdepMaster, DesignationMaster designationMaster,
			RoleMaster roleMaster) {
		super();
		this.empOfficialId = empOfficialId;
		this.ename = ename;
		this.emailId = emailId;
		this.empId = empId;
		this.phone = phone;
		this.joiningDate = joiningDate;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.userName = userName;
		this.password = password;
		this.empProjectStatus = empProjectStatus;
		this.deptdepMaster = deptdepMaster;
		this.designationMaster = designationMaster;
		this.roleMaster = roleMaster;
	}
		
}