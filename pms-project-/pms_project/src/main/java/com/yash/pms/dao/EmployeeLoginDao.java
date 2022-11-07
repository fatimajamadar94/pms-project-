package com.yash.pms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.EmployeeMaster;

@Repository
public interface EmployeeLoginDao extends JpaRepository<EmployeeMaster ,Integer>{

}
