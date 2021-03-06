package com.domino.eleven.member.model;

/** Created by nhs312@gmail.com on 2018-12-03. */
public class Member {

  private long memberNo;
  private String memberName;
  private String zipCode;
  private String address;
  private String mobileNo;
  private String phoneNo;

  public Member() {}

  public long getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(long memberNo) {
    this.memberNo = memberNo;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  @Override
  public String toString() {
    return "Member{" +
            "memberNo=" + memberNo +
            ", memberName='" + memberName + '\'' +
            ", zipCode='" + zipCode + '\'' +
            ", address='" + address + '\'' +
            ", mobileNo='" + mobileNo + '\'' +
            ", phoneNo='" + phoneNo + '\'' +
            '}';
  }
}
