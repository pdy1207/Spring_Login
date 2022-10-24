package com.study.dyproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.dyproject.service.MemberService;
import com.study.dyproject.vo.MemberVO;

@RestController
@RequestMapping("/api/d1")
@CrossOrigin
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/user")
	public List<MemberVO> callMemberAll(){
		return service.getMemberAll();
	}
	
	@PostMapping("/user")
	public int callMemberInsert(@RequestBody MemberVO vo) {
		return service.getMemberInsert(vo);
	}
	
	@GetMapping("/user/member/{userid}")
	public MemberVO callMemberLogin(@PathVariable String userid) {
		return service.getMemberLogin(userid);
				
	}
}
