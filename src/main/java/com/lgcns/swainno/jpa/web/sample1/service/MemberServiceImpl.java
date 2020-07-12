package com.lgcns.swainno.jpa.web.sample1.service;

import com.lgcns.swainno.jpa.web.sample1.entity.Member;
import com.lgcns.swainno.jpa.web.sample1.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> retrieveMembers() throws Exception {
        return memberRepository.findAll();
    }

    @Override
    public Member retrieveMember(Long id) throws Exception {
        Optional<Member> optional = memberRepository.findById(id);
        if (optional.isPresent()) {
            Member member = optional.get();
            return member;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public void saveMember(Member member) throws Exception {
        memberRepository.save(member);
    }

    @Override
    public void deleteMember(Long id) throws Exception {
        memberRepository.deleteById(id);
    }

    @Override
    public void updateMember(Member member) throws Exception {
        memberRepository.save(member);
    }
}
