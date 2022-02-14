package com.admissions.registration.studentregistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_academic_detail")
public class StudentAcademicDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "academic_year")
    private int academicyear;

    @Column(name = "admission_Type")
    private String admissionType;
    
    @Column(name = "classLevel")
	private String classLevel;
	
	@Column(name = "combination")
	private String combination;
	
	@Column(name = "primaryLanguage")
	private String primaryLanguage;
	
	@Column(name = "secondaryLanguage")
	private String secondaryLanguage;
	
	@Column(name = "qualifyingExam")
	private String qualifyingExam;
	
	@Column(name = "medium_info")
	private String medium;
	
	@Column(name = "previousExamregistrationNum")
	private long previousExamregistrationNum;
	
	@Column(name = "satsNo")
	private long satsNo;
	
	@Column(name = "board")
	private String board;
	
	@Column(name = "schoolName")
	private String schoolName;
	
	@Column(name = "yearOfPassing")
	private int yearOfPassing;
	
	@Column(name = "obtainMarks")
	private  int obtainMarks;
	
	@Column(name = "percentage")
	private float percentage;
	

    public StudentAcademicDetail() {

    }



	public StudentAcademicDetail(int academicyear, String admissionType, String classLevel, String combination,
			String primaryLanguage, String secondaryLanguage, String qualifyingExam, String medium,
			long previousExamregistrationNum, long satsNo, String board, String schoolName, int yearOfPassing,
			int obtainMarks, float percentage) {
		super();
		this.academicyear = academicyear;
		this.admissionType = admissionType;
		this.classLevel = classLevel;
		this.combination = combination;
		this.primaryLanguage = primaryLanguage;
		this.secondaryLanguage = secondaryLanguage;
		this.qualifyingExam = qualifyingExam;
		this.medium = medium;
		this.previousExamregistrationNum = previousExamregistrationNum;
		this.satsNo = satsNo;
		this.board = board;
		this.schoolName = schoolName;
		this.yearOfPassing = yearOfPassing;
		this.obtainMarks = obtainMarks;
		this.percentage = percentage;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public int getAcademicyear() {
		return academicyear;
	}

	public void setAcademicyear(int academicyear) {
		this.academicyear = academicyear;
	}

	public String getAdmissionType() {
		return admissionType;
	}

	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}

	public String getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}

	public String getCombination() {
		return combination;
	}

	public void setCombination(String combination) {
		this.combination = combination;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public String getSecondaryLanguage() {
		return secondaryLanguage;
	}

	public void setSecondaryLanguage(String secondaryLanguage) {
		this.secondaryLanguage = secondaryLanguage;
	}

	public String getQualifyingExam() {
		return qualifyingExam;
	}

	public void setQualifyingExam(String qualifyingExam) {
		this.qualifyingExam = qualifyingExam;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public long getPreviousExamregistrationNum() {
		return previousExamregistrationNum;
	}

	public void setPreviousExamregistrationNum(long previousExamregistrationNum) {
		this.previousExamregistrationNum = previousExamregistrationNum;
	}

	public long getSatsNo() {
		return satsNo;
	}

	public void setSatsNo(long satsNo) {
		this.satsNo = satsNo;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public int getObtainMarks() {
		return obtainMarks;
	}

	public void setObtainMarks(int obtainMarks) {
		this.obtainMarks = obtainMarks;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

  

   
}