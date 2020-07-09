package com.lgcns.swainno.jpa.web.sample3.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lgcns.swainno.jpa.web.sample3.dto.*;
import com.lgcns.swainno.jpa.web.sample3.entity.*;

@Service
public class Sample3Service {
	
	private Sample3Repository sample3Repository;
	
	public Sample3Service(Sample3Repository sample3Repository) {
		this.sample3Repository = sample3Repository;
	}
    
	@Transactional
	public long retrListMemberInfo(MemberDto memberdto) {
		// TODO Auto-generated method stub
		return sample3Repository.save(memberdto.toEntity()).getId();
	}

	
 
}
