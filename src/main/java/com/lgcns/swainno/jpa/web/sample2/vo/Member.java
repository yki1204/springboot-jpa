package com.lgcns.swainno.jpa.web.sample2.vo;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Member {
	
	@Id
	String memberId;
}
