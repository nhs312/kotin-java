package com.domino.eleven.member.request;

/** Created by nhs312@gmail.com on 2018-12-03. */
public class MemberJoinBizmallRequest extends MemberJoinCommonRequest {

  private long companyNo;

  public MemberJoinBizmallRequest() {}

  public long getCompanyNo() {
    return companyNo;
  }

  public void setCompanyNo(long companyNo) {
    this.companyNo = companyNo;
  }
}
