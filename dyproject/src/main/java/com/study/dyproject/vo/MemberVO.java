package com.study.dyproject.vo;

public class MemberVO {
	
	private String userid; //가입유저 아이디
	private int userpw; //가입유저 비밀번호
	private String email; //가입유저 이메일
	private String name; //가입유저 성명
	private int phone; //가입유저 핸드폰
	private String createAt; //가입한 시간
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getUserpw() {
		return userpw;
	}
	public void setUserpw(int userpw) {
		this.userpw = userpw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	
	
}
