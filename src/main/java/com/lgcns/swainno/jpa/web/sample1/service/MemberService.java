package com.lgcns.swainno.jpa.web.sample1.service;

import com.lgcns.swainno.jpa.web.sample1.entity.Company;
import com.lgcns.swainno.jpa.web.sample1.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> retrieveMembers() throws Exception;

    Member retrieveMember(Long id) throws Exception;

    void saveMember(Member member) throws Exception;

    void deleteMember(Long id) throws Exception;

    void updateMember(Member member) throws Exception;
}
