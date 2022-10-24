package com.study.dyproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.dyproject.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
	
	public List<MemberVO> selectMember();
	
	public int insertMember(MemberVO vo);
	
	public MemberVO selMemberLogin(String userid);
}
