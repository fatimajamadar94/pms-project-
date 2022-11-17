package com.yash.pms.serviceimplimentation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.dao.AttendanceDao;
import com.yash.pms.model.Attendance;
import com.yash.pms.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private AttendanceDao attendancedao;
	
	
	@Override
	public String addAttendance(Attendance atten) {
		attendancedao.save(atten);
		return "Attendance created Succesfully";
	}

	@Override
	public Optional<Attendance> getAttendanceById(int attenId) {
		// TODO Auto-generated method stub
		return attendancedao.findById(attenId);
	}

}
