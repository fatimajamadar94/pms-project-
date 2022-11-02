package com.yash.pms.pmsdao;

import org.springframework.data.repository.CrudRepository;

import com.yash.pms.model.EmployeeMaster;

public interface RegisterDao extends CrudRepository<EmployeeMaster ,Integer> {

//	int saveRegister(EmployeeMaster employeeMaster);

}
