package com.myboot01.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.myboot01.web.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {
	public void insertMember(MemberVO memberVO);
	
}
