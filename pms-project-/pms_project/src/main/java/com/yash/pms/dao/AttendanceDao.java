package com.yash.pms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.Attendance;

@Repository
public interface AttendanceDao extends JpaRepository<Attendance ,Integer >{

}
