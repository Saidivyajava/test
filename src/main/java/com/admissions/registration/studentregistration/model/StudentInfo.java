package com.admissions.registration.studentregistration.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "student_info")
	public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "student_Name")
    private String studentName;

    @Column(name = "father_Name")
    private String fatherName;

    @Column(name = "gender_Name")
    private String genderName;
    
    @Column(name = "mother_name")
	private String motherName;

	@Column(name = "dateof_birth")
	private  LocalDate dateOfBirth;
	
	@Column(name = "bloodGroup")
	private String bloodGroup;

	@Column(name = "physical_challenge")
	private String physicall_challenge;

	@Column(name = "studentType")
	private String studentType;

	@Column(name = "aadhar_number",unique=true)
	private long aadharNumber;

	@Column(name = "caste")
	private String caste;

	@Column(name = "religion")
	private String religion;

	@Column(name = "community")
	private String community;

	@Column(name = "nationality")
	private String nationality;
	
	@JsonProperty("studentAcademicDetail")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_academic_detail_id")
    private StudentAcademicDetail studentAcademicDetail;
    
	@JsonProperty("studentAddressDetail")
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="student_address_detail_id")
    private List<StudentAddressDetail> studentAddressDetail;

    public StudentInfo() {

    }

	public StudentInfo(String studentName, String fatherName, String genderName, String motherName,
			LocalDate dateOfBirth, String bloodGroup, String physicall_challenge, String studentType, long aadharNumber,
			String caste, String religion, String community, String nationality) {
		super();
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.genderName = genderName;
		this.motherName = motherName;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.physicall_challenge = physicall_challenge;
		this.studentType = studentType;
		this.aadharNumber = aadharNumber;
		this.caste = caste;
		this.religion = religion;
		this.community = community;
		this.nationality = nationality;
	}
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getPhysicall_challenge() {
		return physicall_challenge;
	}
	public void setPhysicall_challenge(String physicall_challenge) {
		this.physicall_challenge = physicall_challenge;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public StudentAcademicDetail getStudentAcademicDetail() {
		return studentAcademicDetail;
	}
	public void setStudentAcademicDetail(StudentAcademicDetail studentAcademicDetail) {
		this.studentAcademicDetail = studentAcademicDetail;
	}

	public List<StudentAddressDetail> getStudentAddressDetail() {
		return studentAddressDetail;
	}

	public void setStudentAddressDetail(List<StudentAddressDetail> studentAddressDetail) {
		this.studentAddressDetail = studentAddressDetail;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", studentName=" + studentName + ", fatherName=" + fatherName + ", genderName="
				+ genderName + ", motherName=" + motherName + ", dateOfBirth=" + dateOfBirth + ", bloodGroup="
				+ bloodGroup + ", physicall_challenge=" + physicall_challenge + ", studentType=" + studentType
				+ ", aadharNumber=" + aadharNumber + ", caste=" + caste + ", religion=" + religion + ", community="
				+ community + ", nationality=" + nationality + ", studentAcademicDetail=" + studentAcademicDetail
				+ ", studentAddressDetail=" + studentAddressDetail + "]";
	}
   
}