/***
 * @name : CompanyDto
 * @path : com.lgcns.swainno.jpa.web.sample3.dto.CompanyDto.java
 * @description : Controller와 Service 사이의 매개가 되는 Company에 대한 Dto 클래스
 */
package com.lgcns.swainno.jpa.web.sample3.dto;

import com.lgcns.swainno.jpa.web.sample3.entity.CompanyE;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CompanyDto {
	
	private long id;
	private String name;
	
	
	public CompanyE toEntity() {
		
		CompanyE build = CompanyE.builder()
				.id(id)
				.name(name)
				.build();
		
		return build;
		
	}
	
	@Builder
	public CompanyDto(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
}


