package com.model.dao;

import com.model.dto.memberDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public interface memberDAO {
    List<memberDTO> selectAllMemberList();

    memberDTO selectMemberByCode(SqlSession sqlSession, @Param("memberCode") String memberCode);

    int insertMember(memberDTO member);

    int updateMember(memberDTO member);


    int deleteMember(int code);
}
