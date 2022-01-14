package com.khc.app.member.vo;

public class MemberVO {
	private String memberId;
	private String memberPw;
	private int memberAge;
	private String memberGender;
	private String memberEmail;
	private String memberZipcode;
	private String memberAdress;
	private String memberAdressDetail;
	private String memberAdressEtc;
	
	public MemberVO() {}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberZipcode() {
		return memberZipcode;
	}

	public void setMemberZipcode(String memberZipcode) {
		this.memberZipcode = memberZipcode;
	}

	public String getMemberAdress() {
		return memberAdress;
	}

	public void setMemberAdress(String memberAdress) {
		this.memberAdress = memberAdress;
	}

	public String getMemberAdressDetail() {
		return memberAdressDetail;
	}

	public void setMemberAdressDetail(String memberAdressDetail) {
		this.memberAdressDetail = memberAdressDetail;
	}

	public String getMemberAdressEtc() {
		return memberAdressEtc;
	}

	public void setMemberAdressEtc(String memberAdressEtc) {
		this.memberAdressEtc = memberAdressEtc;
	}
}