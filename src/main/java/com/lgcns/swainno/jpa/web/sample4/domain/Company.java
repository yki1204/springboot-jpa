package com.lgcns.swainno.jpa.web.sample4.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	
	@Id
	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
