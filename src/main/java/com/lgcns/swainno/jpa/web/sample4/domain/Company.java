package com.lgcns.swainno.jpa.web.sample4.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name = "company")
@Getter
public class Company {
	
	@Id
	private long id;
	
	private String name;
	
}
