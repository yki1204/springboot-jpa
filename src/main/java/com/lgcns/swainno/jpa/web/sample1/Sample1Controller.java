package com.lgcns.swainno.jpa.web.sample1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.swainno.jpa.web.sample1.entity.Company;
import com.lgcns.swainno.jpa.web.sample1.entity.Member;
import com.lgcns.swainno.jpa.web.sample1.entity.OrderInfo;
import com.lgcns.swainno.jpa.web.sample1.service.CompanyService;
import com.lgcns.swainno.jpa.web.sample1.service.MemberService;
import com.lgcns.swainno.jpa.web.sample1.service.OrderInfoService;

/**
 * 
 * @author yhj
 *
 */
@RestController
public class Sample1Controller {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping(value = "/members")
    public List<Member> getMembers() throws Exception{
        return memberService.retrieveMembers();
    }

    @GetMapping(value = "/members/{id}")
    public Member getMember(@PathVariable("id") Long id) throws Exception{
        return memberService.retrieveMember(id);
    }

    @PostMapping(value = "/member")
    public void registerMember(@RequestBody Member member) throws Exception{
        memberService.saveMember(member);
    }

    @PutMapping(value = "/members/{id}")
    public void updateMember(@RequestBody Member member) throws Exception{
        memberService.updateMember(member);
    }

    @DeleteMapping(value = "/members/{id}")
    public void deleteMember(@PathVariable("id") Long id) throws Exception{
        memberService.deleteMember(id);
    }

    @GetMapping(value = "/companies")
    public List<Company> getCompanies() throws Exception{
        return companyService.retrieveCompanies();
    }

    @GetMapping(value = "/companies/{id}")
    public Company getCompany(@PathVariable("id") Long id) throws Exception{
        return companyService.retrieveCompany(id);
    }

    @PostMapping(value = "/company")
    public void registerCompany(@RequestBody Company company) throws Exception{
        companyService.saveCompany(company);
    }

    @PutMapping(value = "/companies/{id}")
    public void updateCompany(@RequestBody Company company) throws Exception{
        companyService.updateCompany(company);
    }

    @DeleteMapping(value = "/companies/{id}")
    public void deleteCompany(@PathVariable("id") Long id) throws Exception{
        companyService.deleteCompany(id);
    }
    @GetMapping(value = "/orderInfo")
    public List<OrderInfo> getOrderInfos() throws Exception{
        return orderInfoService.retrieveOrderInfos();
    }

    @GetMapping(value = "/orderInfo/{id}")
    public OrderInfo getOrderInfo(@PathVariable("id") Long id) throws Exception{
        return orderInfoService.retrieveOrderInfo(id);
    }

    @PostMapping(value = "/orderInfo")
    public void registerOrderInfo(@RequestBody OrderInfo orderInfo) throws Exception{
        orderInfoService.saveOrderInfo(orderInfo);
    }

    @PutMapping(value = "/orderInfo/{id}")
    public void updateOrderInfo(@RequestBody OrderInfo orderInfo) throws Exception{
        orderInfoService.updateOrderInfo(orderInfo);
    }

    @DeleteMapping(value = "/orderInfo/{id}")
    public void deleteOrderInfo(@PathVariable("id") Long id) throws Exception{
        orderInfoService.deleteOrderInfo(id);
    }
}
