package com.yash.pms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yash.pms.model.EmployeeMaster;

public interface RegisterDao extends JpaRepository<EmployeeMaster, Integer> {

//	EmployeeMaster userLogin(String username, String password);

	//EmployeeMaster save(EmployeeMaster employeeMaster);

//	int saveRegister(EmployeeMaster employeeMaster);
	@Query( value = "SELECT * FROM employee_master where email_id = ?1" , nativeQuery = true)
	public EmployeeMaster findByEmail(String email);
	
@Query(value="select * from employee_master where email_id=?1 and password=?2",nativeQuery=true)
	 public EmployeeMaster findByEmailAndPassword(String email,String password);

@Query(value="select * from employee_master where user_name IS NULL",nativeQuery=true)
public List<EmployeeMaster> registerList();
//@Query(value ="select * from employee_master where emp_official_id=?1",nativeQuery=true)
//public EmployeeMaster  findById(Int);



}
