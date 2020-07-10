/***
 * @name : MemberDto
 * @path : com.lgcns.swainno.jpa.web.sample3.dto.MemberDto.java
 * @description : Controller와 Service 사이의 매개가 되는 member에 대한 Dto 클래스
 */
package com.lgcns.swainno.jpa.web.sample3.dto;

import com.lgcns.swainno.jpa.web.sample3.entity.CompanyE;
import com.lgcns.swainno.jpa.web.sample3.entity.MemberE;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
	
	private long id;
	private String name;
	private int age;
	private long companyId;
	private String companyNm;
	private CompanyE company;
	
	public MemberE toEntity() {
		
		MemberE build = MemberE.builder()
				.id(id)
				.name(name)
				.age(age)
				.company(company)
				.build();
		
		return build;
		
	}

	@Builder
	public MemberDto(long id, String name,int age, CompanyE company) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.company = company;
		this.companyId = company.getId();
		this.companyNm = company.getName();
		
	}	
}


