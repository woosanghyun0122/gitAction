package com.test.cicd.Member.controller;

import com.test.cicd.Member.domain.Member;
import com.test.cicd.Member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("/find/member")
    public String findMember(Model model) {

        log.info("Controller Start!!");
        List<Member> list = service.findAll();
        model.addAttribute("list", list);
        log.info("Controller end!!");
        return "member/list";
    }

}
