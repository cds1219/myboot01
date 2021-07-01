package com.myboot01.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myboot01.web.service.MemberService;
import com.myboot01.web.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;

	@ResponseBody
	@RequestMapping("/memberInsert")
	public String memberInsert(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("memberInsert() 호출됨");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		
		MemberVO vo=new MemberVO(id,pw,name);
		System.out.println(vo);
		
		memberService.insertMember(vo);
		
		return "회원가입ok";
	}
}
