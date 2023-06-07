package com.model.dao;

import com.model.dto.memberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public interface memberDAO {
    List<memberDTO> selectAllMemberList();

    int insertMember(memberDTO member);

    int updateMember(memberDTO member);

    int deleteMember(int code);

    String selectMemberByCode(SqlSession sqlSession);
}
