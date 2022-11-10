package com.yash.pms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.RoleMaster;

@Repository
public interface RoleDao extends JpaRepository<RoleMaster, Integer> {

}
