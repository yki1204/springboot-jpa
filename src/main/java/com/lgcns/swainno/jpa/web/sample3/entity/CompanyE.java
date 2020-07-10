package com.lgcns.swainno.jpa.web.sample3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "company")
public class CompanyE {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Builder
	public CompanyE(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
}
