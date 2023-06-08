package com.model.service;
import com.model.dao.memberDAO;
import com.model.dto.memberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.common.jdbc.Template.getSqlSession;

public class MemberService {

    private memberDAO memberDAO;

    public List<memberDTO> selectAllMemberList() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        List<memberDTO> allMemberList = memberDAO.selectAllMemberList();

        sqlSession.close();

        return allMemberList;


    }

    public List<memberDTO> selectMemberList() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        List<memberDTO> allMemberList2 = memberDAO.selectMemberList();

        sqlSession.close();

        return allMemberList2;
    }


    public memberDTO selectMemberByCode(String memberCode) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        memberDTO memberList = memberDAO.selectMemberByCode(sqlSession, memberCode);

        sqlSession.close();

        return memberList;
    }

    public int registNewMember(memberDTO member) {


        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        int result = memberDAO.insertMember(member);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int modifyMember(memberDTO member) {


        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        int result = memberDAO.updateMember(member);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;

    }

    public int deleteMember(int code) {


        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        int result = memberDAO.deleteMember(code);

        if (result > 0) {
            System.out.println("삭제성공5");
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        System.out.println("삭제성공6");
        return result;


    }


}
