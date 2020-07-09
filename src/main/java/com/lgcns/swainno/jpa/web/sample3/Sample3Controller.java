package com.lgcns.swainno.jpa.web.sample3;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
	private Sample3Repository sample3Repository;
	
	public Sample3Controller(Sample3Service sample3service) {
		this.sample3service = sample3service;
	}
	
	@GetMapping("/")
	public String list() {
		return null;
	}
	
	@GetMapping("/post")
	public String retrListCustInfo() {
		return null;
	}
	
	@PostMapping("/post")
	public long retrListMemberInfo(MemberDto member) {
		
		//sample3service.retrListMemberInfo(member);
		return sample3service.retrListMemberInfo(member);
	}
	
		
	public static void retrListCustInfo(String test1) throws Exception{
			
		System.out.println("test");
		
	}

}
