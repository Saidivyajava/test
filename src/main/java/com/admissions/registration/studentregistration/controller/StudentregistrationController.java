package com.admissions.registration.studentregistration.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admissions.registration.studentregistration.dao.StudentRegistrationRepository;
import com.admissions.registration.studentregistration.model.StudentInfo;
import com.admissions.registration.studentregistration.service.StudentRegistrationService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping("/api")
public class StudentregistrationController {
	//autowire service
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	@Autowired private StudentRegistrationRepository
	  studentRegistrationRepository;
	  
	// create student registraion rest api
    @PostMapping(value="/students")
    public StudentInfo  registerStudent(@RequestBody StudentInfo studentDTO) {
		/*
		 * System.out.println(studentDTO.getCaste());
		 * System.out.println(studentDTO.getAadharNumber());
		 */
    	StudentInfo sInfo = new StudentInfo(); 
    	BeanUtils.copyProperties(studentDTO, sInfo);
    	//System.out.println(" academic year " + sInfo.getStudentAcademicDetail().getAcademicyear());
		
    	  //System.out.println(" entity " + sInfo.toString());
		  Gson gson = new GsonBuilder().create(); String json = gson.toJson(studentDTO);
		  System.out.println("json format " +json);
		 
    	
		  return studentRegistrationRepository.save(sInfo);
        
    }

}
