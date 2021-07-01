package com.myboot01.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myboot01.web.dao.MemberDAO;
import com.myboot01.web.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;
	
	public void insertMember(MemberVO memberVO) {
		memberDAO.insertMember(memberVO);
	}
}
