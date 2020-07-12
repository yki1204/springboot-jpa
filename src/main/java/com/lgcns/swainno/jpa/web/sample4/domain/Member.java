package com.lgcns.swainno.jpa.web.sample4.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {
	
	@Id
	private long id;
	
	private String name;
	
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Company getCompany() {
		return company;
	}
	
}
