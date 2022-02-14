package com.admissions.registration.studentregistration.configuration;

import java.time.LocalDate;
import java.util.List;


public class StudentRegistrationInfoDTO {

	public String getStudentName() {
		return studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public String getGenderName() {
		return genderName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public String getPhysicall_challenge() {
		return physicall_challenge;
	}

	public String getStudentType() {
		return studentType;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public String getCaste() {
		return caste;
	}

	public String getReligion() {
		return religion;
	}

	public String getCommunity() {
		return community;
	}

	public String getNationality() {
		return nationality;
	}

	

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setPhysicall_challenge(String physicall_challenge) {
		this.physicall_challenge = physicall_challenge;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	

	private String studentName;
	
	private String fatherName;

	private String motherName;
	
	private String genderName;

	private  LocalDate dateOfBirth;

	private String bloodGroup;
	
	private String physicall_challenge;
	
	private String studentType;
	
	private long aadharNumber;

	private String caste;
	
	private String religion;
	
	private String community;

	private String nationality;
	
	

	
	
}
