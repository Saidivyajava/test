package com.admissions.registration.studentregistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_address_detail")
public class StudentAddressDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "address")
	private String address;
	
	@Column(name = "mobile_Number",length=10)
	private long  mobileNumber;
	
	@Column(name = "parent_MobileNumber",length=10)
	private long parentMobileNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "talk")
	private String talk;
	
	@Column(name = "suburbun")
	private String suburbun;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "postalCode")
	private int postalCode;
	 
	
	 public StudentAddressDetail() {

	    }

    public StudentAddressDetail(String address, long mobileNumber, long parentMobileNumber, String email, String state,
			String district, String talk, String suburbun, String country, int postalCode) {
		super();
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.parentMobileNumber = parentMobileNumber;
		this.email = email;
		this.state = state;
		this.district = district;
		this.talk = talk;
		this.suburbun = suburbun;
		this.country = country;
		this.postalCode = postalCode;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getParentMobileNumber() {
		return parentMobileNumber;
	}

	public void setParentMobileNumber(long parentMobileNumber) {
		this.parentMobileNumber = parentMobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTalk() {
		return talk;
	}

	public void setTalk(String talk) {
		this.talk = talk;
	}

	public String getSuburbun() {
		return suburbun;
	}

	public void setSuburbun(String suburbun) {
		this.suburbun = suburbun;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

    
}