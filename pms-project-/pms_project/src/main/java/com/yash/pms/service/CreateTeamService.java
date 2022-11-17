package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.ProjectDetails;
import com.yash.pms.model.ProjectTeam;
import com.yash.pms.model.TeamReqDto;

public interface CreateTeamService  {

	String addTeam(ProjectTeam projectTeam);

	 List<ProjectTeam> getAllTeam();

}
