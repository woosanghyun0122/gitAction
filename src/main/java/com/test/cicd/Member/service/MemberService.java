package com.test.cicd.Member.service;

import com.test.cicd.Member.domain.Member;
import com.test.cicd.Member.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;

    public List<Member> findAll() {

        log.info("Service start!!");
        return repository.findAll();
    }


}
