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
    
	@Transactional
	public List<MemberDto> retrListMemberInfo() {
		// TODO Auto-generated method stub
		
		List<MemberE> memberList = memberRepository.findAll();
		
		List<MemberDto> resultList = new ArrayList<MemberDto>();
		
		for(MemberE member : memberList) {
			MemberDto memberDto = MemberDto.builder()
					.id(member.getId())
					.name(member.getName())
					.age(member.getAge())
					.company(member.getCompany())
					//.companyId(member.getCompany().getId())
					//.CompanyNm(member.getCompany().getName())
					.build();
			resultList.add(memberDto);
			
			System.out.println("***************************** 데이터 : " + memberDto);
					
		}
		
		return resultList;

	}


 
}
