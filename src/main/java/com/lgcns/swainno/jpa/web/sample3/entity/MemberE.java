package com.lgcns.swainno.jpa.web.sample3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "member")
public class MemberE {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
//	@Column(name = "company_id")
//	private long companyId;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private CompanyE company;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public CompanyE getCompany() {
		return company;
	}
	
//	public long getCompanyId() {
//		return companyId;
//	}


	@Builder
	public MemberE(long id, String name,int age, CompanyE company) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.company = company;
	}


	
}
