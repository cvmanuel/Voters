package com.example.votersuk.model;


import javax.persistence.Entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "voterslist")
@EntityListeners(AuditingEntityListener.class)
public class VotersList implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique=true, nullable = true)
	private Integer id;
	
	@Column(name="elector_number_prefix",nullable = false)
	private String eNumberPrefix;
	
	@Column(name="elector_number",nullable = false)
	private int eNumber;
	
	@Column(name="elector_number_suffix",nullable = false)
	private int eNumberSuffix;
	
	@Column(name="elector_markers")
	private String eMarkers;
	
	@Column(name="elector_dob")
	private java.sql.Date eDOB;
	
	@Column(name="elector_surname")
	private String eSurname;
	
	@Column(name="elector_forename")
	private String eForename;
	
	@Column(name="postcode")
	private String ePostCode;
	
	@Column(name="address1")
	private String eAddress1;
	
	@Column(name="address2")
	private String eAddress2;
	
	@Column(name="address3")
	private String eAddress3;
	
	@Column(name="address4")
	private String eAddress4;
	
	
	public VotersList()
	{}

	public VotersList(Integer id, String eNumberPrefix, int eNumber, int eNumberSuffix, String eMarkers, java.sql.Date eDOB,
			String eSurname, String eForename, String ePostCode, String eAddress1, String eAddress2, String eAddress3,
			String eAddress4) {
		super();
		this.id = id;
		this.eNumberPrefix = eNumberPrefix;
		this.eNumber = eNumber;
		this.eNumberSuffix = eNumberSuffix;
		this.eMarkers = eMarkers;
		this.eDOB = eDOB;
		this.eSurname = eSurname;
		this.eForename = eForename;
		this.ePostCode = ePostCode;
		this.eAddress1 = eAddress1;
		this.eAddress2 = eAddress2;
		this.eAddress3 = eAddress3;
		this.eAddress4 = eAddress4;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String geteNumberPrefix() {
		return eNumberPrefix;
	}

	public void seteNumberPrefix(String eNumberPrefix) {
		this.eNumberPrefix = eNumberPrefix;
	}

	public int geteNumber() {
		return eNumber;
	}

	public void seteNumber(int eNumber) {
		this.eNumber = eNumber;
	}

	public int geteNumberSuffix() {
		return eNumberSuffix;
	}

	public void seteNumberSuffix(int eNumberSuffix) {
		this.eNumberSuffix = eNumberSuffix;
	}

	public String geteMarkers() {
		return eMarkers;
	}

	public void seteMarkers(String eMarkers) {
		this.eMarkers = eMarkers;
	}

	public java.sql.Date geteDOB() {
		return eDOB;
	}

	public void seteDOB(java.sql.Date eDOB) {
		this.eDOB = eDOB;
	}

	public String geteSurname() {
		return eSurname;
	}

	public void seteSurname(String eSurname) {
		this.eSurname = eSurname;
	}

	public String geteForename() {
		return eForename;
	}

	public void seteForename(String eForename) {
		this.eForename = eForename;
	}

	public String getePostCode() {
		return ePostCode;
	}

	public void setePostCode(String ePostCode) {
		this.ePostCode = ePostCode;
	}

	public String geteAddress1() {
		return eAddress1;
	}

	public void seteAddress1(String eAddress1) {
		this.eAddress1 = eAddress1;
	}

	public String geteAddress2() {
		return eAddress2;
	}

	public void seteAddress2(String eAddress2) {
		this.eAddress2 = eAddress2;
	}

	public String geteAddress3() {
		return eAddress3;
	}

	public void seteAddress3(String eAddress3) {
		this.eAddress3 = eAddress3;
	}

	public String geteAddress4() {
		return eAddress4;
	}

	public void seteAddress4(String eAddress4) {
		this.eAddress4 = eAddress4;
	}
	
	
	
	

}
