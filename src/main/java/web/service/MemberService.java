package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.MemberDAO;
import web.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;
	
	public void insertMember(MemberVO memberVO) {
		memberDAO.insertMember(memberVO);
	}
}
