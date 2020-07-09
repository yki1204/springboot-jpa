package com.lgcns.swainno.jpa.web.sample1.repository;

import com.lgcns.swainno.jpa.web.sample1.entity.Company;
import com.lgcns.swainno.jpa.web.sample1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
