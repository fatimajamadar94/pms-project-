package com.yash.pms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.Attendance;
import com.yash.pms.serviceimplimentation.AttendanceServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/atten")
public class AttendanceController {
	
	@Autowired
	private AttendanceServiceImpl attendanceserviceimpl;
	
	@PostMapping("/addatten")
	public String addatten(@RequestBody Attendance atten) {
		String attendance=attendanceserviceimpl.addAttendance(atten);
		return attendance;
	}
	
	@GetMapping("/getatten/{attenId}")
	public Optional<Attendance> getAttenById(@PathVariable("attenId") int attenId){
		
		return attendanceserviceimpl.getAttendanceById(attenId);
	}
	

}
