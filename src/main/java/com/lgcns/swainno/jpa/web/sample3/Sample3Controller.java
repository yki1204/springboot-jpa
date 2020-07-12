/***
 * @name : Sample3Controller
 * @path : com.lgcns.swainno.jpa.web.sample3.Sample3Controller.java
 * @description : Controller 클래스
 */
package com.lgcns.swainno.jpa.web.sample3;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.swainno.jpa.web.sample1.entity.Member;
import com.lgcns.swainno.jpa.web.sample3.dto.*;
import com.lgcns.swainno.jpa.web.sample3.entity.*;
import com.lgcns.swainno.jpa.web.sample3.service.Sample3Service;

import java.io.*;
import java.lang.System.*;
/**
 * 
 * @author ryj
 *
 */

@RestController
public class Sample3Controller {
	
	private Sample3Service sample3service;
	
	@Autowired
	private MemberERepository memberRepository;
	
	@Autowired
	private CompanyERepository companyRepository;
	
	public Sample3Controller(Sample3Service sample3service) {
		this.sample3service = sample3service;
	}
	
	@GetMapping("/")
	public String list() {
		return null;
	}
	
	/**
	 * @apiNote member목록조회 - member id, 이름, 나이, 회사id, 회사이름을 전체조회한다. 
	 * @return List<MemberDto> memberList
	 * @throws Exception
	 */
	@GetMapping("/retMemberList")
	public List<MemberDto> retvMembersListAll() throws Exception{
		
		List<MemberDto> memberList = sample3service.retrListMemberInfo();
		
		return memberList;
	}
	
	/**
	 * @apiNote member목록조회(검색) - name, 또는 회사명에 대한 검색조건에 맞는 member id, 이름, 나이, 회사id, 회사이름을 전체조회한다. 
	 * @return List<MemberDto> memberList
	 * @throws Exception
	 */
	@GetMapping("/retMemberList/{name}")
	public List<MemberDto> searchMemgerLst(@PathVariable("name") String name) throws Exception{
		
		List<MemberDto> memberList = sample3service.retrListMemberInfoForName(name);
		
		return memberList;
	}
	
	
	/**
	 * @apiNote id 정보를 받아 해당 id에 맞는 단건 member를 리턴한다
	 * @param id
	 * @return MemberDto member
	 * @throws Exception
	 */
	@GetMapping("/retMember/{id}")
	public MemberDto retvMemberById(@PathVariable("id") long id) throws Exception{
		
		MemberDto member = sample3service.retMemberById(id);
		
		return member;
	}


}
