package com.study.dyproject.service;

import java.util.List;

import com.study.dyproject.vo.MemberVO;

public interface MemberServiceImple {
	
	public List<MemberVO> getMemberAll();
	
	public int getMemberInsert(MemberVO vo);
	
	public MemberVO getMemberLogin (String userid);
}
