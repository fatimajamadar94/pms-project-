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
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empOfficialId;
	private String ename;
	private String emailId;
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

}
