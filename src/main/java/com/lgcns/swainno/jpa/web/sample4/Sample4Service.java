package com.lgcns.swainno.jpa.web.sample4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.lgcns.swainno.jpa.web.sample4.domain.Member;
import com.lgcns.swainno.jpa.web.sample4.domain.Sample4Repository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Sample4Service {
	
	private Sample4Repository sample4Repository;
	
	public List<MemberDTO> retrieveMemberList() {
		
		List<Member> memberList = sample4Repository.findAll();
		
		List<MemberDTO> memberDTOList = new ArrayList<MemberDTO>();
		
		//List<Member> -> List<MemberDTO>
		memberDTOList = memberList.stream().map(e -> {
										MemberDTO memberDTO = new MemberDTO();
										memberDTO.setId(e.getId());
										memberDTO.setName(e.getName());
										memberDTO.setAge(e.getAge());
										memberDTO.setCompanyName(e.getCompany().getName());
										
										return memberDTO;
									}
						).collect(Collectors.toList());
		
		return memberDTOList;
	}
	
	

}
