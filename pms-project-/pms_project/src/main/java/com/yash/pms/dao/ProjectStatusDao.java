package com.yash.pms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.ProjectStatus;

@Repository
public interface ProjectStatusDao extends JpaRepository<ProjectStatus , Integer>{
	
	

}
