package com.yash.pms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class DepartmentMaster {

	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptName;
	private String DeptDescp;
	
	
	

}
