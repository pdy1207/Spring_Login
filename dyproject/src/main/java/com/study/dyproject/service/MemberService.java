package com.study.dyproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dyproject.mapper.MemberMapper;
import com.study.dyproject.vo.MemberVO;

@Service
public class MemberService implements  MemberServiceImple{

	@Autowired
	private MemberMapper mapper;

	@Override
	public List<MemberVO> getMemberAll() {
		return mapper.selectMember();
	}

	@Override
	public int getMemberInsert(MemberVO vo) {
		return mapper.insertMember(vo);
	}

	@Override
	public MemberVO getMemberLogin(String userid) {
		if(userid == userid){
			return mapper.selMemberLogin(userid);
		}if(userid != ""){
			return mapper.selMemberLogin(userid);
		}
		return null;
	}
}
