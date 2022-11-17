package com.yash.pms.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yash.pms.model.ProjectTeam;

public interface CreateTeamDao extends CrudRepository<ProjectTeam, Integer>  {

	@Query(value = "select * from project_team where emp_official_id=?1 and project_id=?2",nativeQuery=true)
	ProjectTeam isExist(Integer empOfficialId, Integer projecId);

}
