package com.lgcns.swainno.jpa.web.sample2;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.swainno.jpa.web.sample2.service.InformationService;
import com.lgcns.swainno.jpa.web.sample2.vo.InformationRequest;
import com.lgcns.swainno.jpa.web.sample2.vo.Member;
import com.lgcns.swainno.jpa.web.sample2.vo.Result;

/**
 * 
 * @author hsy
 *
 */
@RestController
@RequestMapping("/hsy")
public class Sample2Controller {

	
	@Resource
	private InformationService informationService;
	
	@GetMapping("/infomation/{memberId}")
	public Member retrieveInfomation(@PathVariable String memberId) {
		//company name도 받고 member name도 받는게 뭔지 잘 모르겠어용 ㅠㅎ
		Member member = informationService.retrieveMember(memberId);
		return null;
	}
	
	@GetMapping("/infomation")
	public List<Member> retrieveAllInfomation() {
		//TODO 구현할게요 ㅠ
		String company = "lgcns";
		//company name도 받고 member name도 받는게 뭔지 잘 모르겠어용 ㅠㅎ
		List<Member> members = informationService.retrieveAllMembers(company);
		return members;
	}
	
	@PostMapping("/infomation")
	public Result makeInfomation(@RequestBody InformationRequest request) {
		
		
		return null;
	}
}
