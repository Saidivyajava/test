package com.admissions.registration.studentregistration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admissions.registration.studentregistration.model.StudentInfo;

public interface StudentRegistrationRepository extends   JpaRepository<StudentInfo, Long>{
	
	

}
