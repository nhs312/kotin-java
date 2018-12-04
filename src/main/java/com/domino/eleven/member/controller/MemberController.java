package com.domino.eleven.member.controller;

import com.domino.eleven.member.model.Member;
import com.domino.eleven.member.request.MemberJoinBizmallRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Created by nhs312@gmail.com on 2018-12-03. */
@RestController(value = "members")
public class MemberController {

  @PostMapping
  public void join(@RequestBody MemberJoinBizmallRequest request) {
    Member member = new Member();
    member.setMemberName(request.getMemberName());
    member.setMobileNo(request.getMobileNo());

    System.out.printf(member.toString());
  }
}
