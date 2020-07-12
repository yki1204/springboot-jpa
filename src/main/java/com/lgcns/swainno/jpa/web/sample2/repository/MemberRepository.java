package com.lgcns.swainno.jpa.web.sample2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lgcns.swainno.jpa.web.sample2.vo.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{
	List<Member> findAllByCompanyName(String CompanyName);
}
