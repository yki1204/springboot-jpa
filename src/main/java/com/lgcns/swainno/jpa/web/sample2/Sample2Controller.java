package com.lgcns.swainno.jpa.web.sample2;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.swainno.jpa.web.sample2.service.InfomationService;
import com.lgcns.swainno.jpa.web.sample2.vo.InfomationRequest;
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
	private InfomationService infomationService;
	
	@GetMapping("/infomation/{name}")
	public Result retrieveInfomation(@PathVariable String name) {
		
		return null;
	}
	
	@PostMapping("/infomation")
	public Result makeInfomation(@RequestBody InfomationRequest request) {
		
		
		return null;
	}
}
