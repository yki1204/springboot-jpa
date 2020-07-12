package com.lgcns.swainno.jpa.web.sample2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.swainno.jpa.web.sample2.repository.MemberRepository;
import com.lgcns.swainno.jpa.web.sample2.vo.Member;

@Service
public class InformationService {
 

	@Autowired
	private MemberRepository memberDao;
	
	public List<Member> retrieveAllMembers(String company){
		return memberDao.findAllByCompanyName(company);
	}
	
	public List<Member> retrieveMember(String memberId){
		return memberDao.findById(memberId);
	}
}
