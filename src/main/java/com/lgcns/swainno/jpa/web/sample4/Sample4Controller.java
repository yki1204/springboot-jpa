package com.lgcns.swainno.jpa.web.sample4;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

/**
 * 
 * @author yki
 *
 */
@RestController
@AllArgsConstructor
public class Sample4Controller {
	
	private Sample4Service sample4Service;

	@GetMapping("/sample4/members")
	public List<MemberDTO> retrieveMemberList(){
		return sample4Service.retrieveMemberList();
	}

}
