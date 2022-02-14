package com.admissions.registration.studentregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admissions.registration.studentregistration.dao.StudentRegistrationRepository;
import com.admissions.registration.studentregistration.model.StudentInfo;

@Service
public class StudentRegistrationService {
	
	
	  @Autowired private StudentRegistrationRepository
	  studentRegistrationRepository;
	  
	  public void save(StudentInfo studentInfo) {
	  studentRegistrationRepository.save(studentInfo); }
	 
}
