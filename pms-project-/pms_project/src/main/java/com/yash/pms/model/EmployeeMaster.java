package com.yash.pms.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties("inspection")
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
	private String empStatus;
	private String jobType;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name="deptId")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"}) 
	private DepartmentMaster depMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"}) 
	private DesignationMaster designationMaster;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name="roleId")
	@JsonIgnore
	private RoleMaster roleMaster;

    @OneToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	private List<ProjectTeam> list;
    
    public int getEmpOfficialId() {
		return empOfficialId;
	}
	public void setEmpOfficialId(int empOfficialId) {
		this.empOfficialId = empOfficialId;
	}
	
   
		
	
	public List<ProjectTeam> getList() {
		return list;
	}
	public void setList(List<ProjectTeam> list) {
		this.list = list;
	}

		
	public String geteName() {
		return eName;
	}
	public void seteName(String ename) {
		this.eName = ename;
	}
	

	public EmployeeMaster() {
		super();
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
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public DepartmentMaster getDeptdepMaster() {
		return depMaster;
	}
	public void setDeptdepMaster(DepartmentMaster deptdepMaster) {
		this.depMaster = deptdepMaster;
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

	
	
	
	
	
	
	
	
	
		
}
