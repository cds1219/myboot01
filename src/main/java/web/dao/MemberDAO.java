package web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import web.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {
	public void insertMember(MemberVO memberVO);
	
}
