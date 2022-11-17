package com.yash.pms.service;

import java.util.Optional;

import com.yash.pms.model.Attendance;

public interface AttendanceService {
	
	
	public String addAttendance(Attendance atten);
	
	public Optional<Attendance> getAttendanceById(int attenId);

}
