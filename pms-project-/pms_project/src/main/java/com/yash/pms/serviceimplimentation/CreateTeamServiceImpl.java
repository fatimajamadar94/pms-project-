package com.yash.pms.serviceimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.CreateTeamDao;
import com.yash.pms.dao.RegisterDao;
import com.yash.pms.model.EmployeeMaster;
import com.yash.pms.model.ProjectDetails;
import com.yash.pms.model.ProjectTeam;
import com.yash.pms.model.TeamReqDto;
import com.yash.pms.service.CreateTeamService;

import net.bytebuddy.asm.Advice.Return;

@Service
public class CreateTeamServiceImpl implements CreateTeamService {
	@Autowired
	CreateTeamDao createteamDao;

	@Autowired
	RegisterDao registerDao;

	public String addTeam(ProjectTeam projectTeam) {

//		ProjectTeam projectTeam2 = new ProjectTeam();
//		ProjectDetails projectDetails = new ProjectDetails();
//		for (EmployeeMaster teamReqDto2 : teamreqdto.getList()) {
//
//			projectDetails.setProjectId(teamreqdto.getProjectId());
//			projectTeam2.setProjectDetails(projectDetails);
//			EmployeeMaster emp = new EmployeeMaster();
//			emp.setEmpOfficialId(teamReqDto2.getEmpOfficialId());
//			projectTeam2.setEmployeeMaster(emp);
//			projectTeam2.setEmployeeMaster(emp);
		ProjectTeam projectTeam2=null;
		try {
		 projectTeam2 = createteamDao.save(projectTeam);
		}catch (Exception e) {
e.printStackTrace();		}
		Integer empOfficialId = projectTeam.getEmployeeMaster().getEmpOfficialId();
		Integer projecId = projectTeam.getProjectDetails().getProjectId();
		try {
			if (projectTeam2 != null) {
				EmployeeMaster emp = new EmployeeMaster();
				emp.setEmpOfficialId(empOfficialId);
				emp.setEmpProjectStatus("Allocated");
				registerDao.save(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ProjectTeam isExist = (ProjectTeam) createteamDao.isExist(empOfficialId, projecId);
		if (isExist != null) {
			return "Already allocated on project !!";
		}
//		}

		return "Created Successfully!!";
	}

	@Override
	public List<ProjectTeam> getAllTeam() {
		List<ProjectTeam> list = (List<ProjectTeam>) createteamDao.findAll();
		return list;
	}

}
