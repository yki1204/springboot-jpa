/***
 * @name : Sample3Service
 * @path : com.lgcns.swainno.jpa.web.sample3.service.Sample3Service.java
 * @description : 실제 비즈니스 로직을 수행하는 Service 클래스
 */
package com.lgcns.swainno.jpa.web.sample3.service;

import java.util.*;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lgcns.swainno.jpa.web.sample1.entity.Member;
import com.lgcns.swainno.jpa.web.sample3.dto.*;
import com.lgcns.swainno.jpa.web.sample3.entity.*;

@Service
public class Sample3Service {
	
	private MemberERepository memberRepository;
	
	public Sample3Service(MemberERepository memberRepository) {
		this.memberRepository = memberRepository;
	}
    
	/**
	 * @name retrListMemberInfo
	 * @return List<MemberDto>
	 * @apiNote 전체목록을 리턴한다.
	 */
	@Transactional
	public List<MemberDto> retrListMemberInfo() {

		List<MemberE> memberList = memberRepository.findAll();
		
		List<MemberDto> resultList = new ArrayList<MemberDto>();
		
		for(MemberE member : memberList) {
			MemberDto memberDto = MemberDto.builder()
					.id(member.getId())
					.name(member.getName())
					.age(member.getAge())
					.company(member.getCompany())

					.build();
			
			memberDto.setCompanyId(memberDto.getCompany().getId());
			memberDto.setCompanyNm(memberDto.getCompany().getName());
			resultList.add(memberDto);
			
					
		}
		
		return resultList;

	}

	/**
	 * @name retrListMemberInfoForName
	 * @param name
	 * @return List<MemberDto>
	 * @apiNote 이름 또는 회사명 검색어에 대한 목록을 리턴한다. 검색어가 없는 경우 전체 목록을 리턴한다.
	 */
	@Transactional
	public List<MemberDto> retrListMemberInfoForName(String name) {

		List<MemberE> memberList = memberRepository.findAll();
		List<MemberDto> resultList = new ArrayList<MemberDto>();
		
		for(MemberE member : memberList) {
			MemberDto memberDto = MemberDto.builder()
					.id(member.getId())
					.name(member.getName())
					.age(member.getAge())
					.company(member.getCompany())

					.build();
			
			memberDto.setCompanyId(memberDto.getCompany().getId());
			memberDto.setCompanyNm(memberDto.getCompany().getName());
			
			if(memberDto.getCompanyNm().contains(name) || memberDto.getName().contains(name)) {
				resultList.add(memberDto);
			}
	
		}
		return resultList;
	}

	/**
	 * @name retMemberById
	 * @param id
	 * @return MemberDto
	 * @apiNote id에 맞는 단건 dto를 리턴한다.
	 */
	@Transactional
	public MemberDto retMemberById(long id) {
		
		//MemberE member =  new MemberE();
		
		MemberDto result = new MemberDto();
		
		Optional<MemberE> member = memberRepository.findById(id);
		
		if(member.isPresent()) {
			result = MemberDto.builder()
					.id(member.get().getId())
					.name(member.get().getName())
					.age(member.get().getAge())
					.company(member.get().getCompany())
					.build();
			
			result.setCompanyId(result.getCompany().getId());
			result.setCompanyNm(result.getCompany().getName());
		}
		
		return result;
	}


 
}
