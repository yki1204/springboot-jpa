/***
 * @name : Member Entity
 * @path : com.lgcns.swainno.jpa.web.sample3.entity.MemberE.java
 * @description : member 테이블 정보를 관리하기 위한 클래스
 */
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
	
	/**
	 * Builder 어노테이션으로 setter를 제공
	 * @param id
	 * @param name
	 * @param age
	 * @param company
	 */
	@Builder
	public MemberE(long id, String name,int age, CompanyE company) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.company = company;
	}


	
}
