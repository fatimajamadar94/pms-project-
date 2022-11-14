package com.yash.pms.dao;

import org.springframework.data.repository.CrudRepository;

import com.yash.pms.model.ProjectTeam;

public interface CreateTeamDao extends CrudRepository<ProjectTeam, Integer>  {

}
