package com.yash.pms.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EmployeeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empOfficialId;
	private String eName;
	private String emailId;
	private String empId;
	private String phone;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date joiningDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedDate;
	private String userName;
	private String password;
	private String empProjectStatus;
	private String jobType;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name="deptId")
	@JsonIgnore
	private DepartmentMaster deptdepMaster;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name="designId")
	@JsonIgnore
	private DesignationMaster designationMaster;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name="roleId")
	@JsonIgnore
	private RoleMaster roleMaster;
	
	public EmployeeMaster(){
		
	}

	public EmployeeMaster(int empOfficialId, String eName, String emailId, String empId, String phone, String gender,
			Date birthdate, Date joiningDate, Date createdDate, Date updatedDate, String userName, String password,
			String empProjectStatus, String jobType, DepartmentMaster deptdepMaster,
			DesignationMaster designationMaster, RoleMaster roleMaster) {
		super();
		this.empOfficialId = empOfficialId;
		this.eName = eName;
		this.emailId = emailId;
		this.empId = empId;
		this.phone = phone;
		this.gender = gender;
		this.birthdate = birthdate;
		this.joiningDate = joiningDate;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.userName = userName;
		this.password = password;
		this.empProjectStatus = empProjectStatus;
		this.jobType = jobType;
		this.deptdepMaster = deptdepMaster;
		this.designationMaster = designationMaster;
		this.roleMaster = roleMaster;
	}

	public int getEmpOfficialId() {
		return empOfficialId;
	}

	public void setEmpOfficialId(int empOfficialId) {
		this.empOfficialId = empOfficialId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
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

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
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

	@Override
	public String toString() {
		return "EmployeeMaster [empOfficialId=" + empOfficialId + ", eName=" + eName + ", emailId=" + emailId
				+ ", empId=" + empId + ", phone=" + phone + ", gender=" + gender + ", birthdate=" + birthdate
				+ ", joiningDate=" + joiningDate + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", userName=" + userName + ", password=" + password + ", empProjectStatus=" + empProjectStatus
				+ ", jobType=" + jobType + ", deptdepMaster=" + deptdepMaster + ", designationMaster="
				+ designationMaster + ", roleMaster=" + roleMaster + "]";
	}
	
	
	
	
	
	
	
	
	
		
}
