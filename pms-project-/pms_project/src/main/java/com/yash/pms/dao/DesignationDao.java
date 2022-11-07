package com.yash.pms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.DesignationMaster;

@Repository
public interface DesignationDao extends JpaRepository<DesignationMaster , Integer>{

}
