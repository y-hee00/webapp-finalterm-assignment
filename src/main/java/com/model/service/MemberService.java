package com.model.service;
import com.model.dao.memberDAO;
import com.model.dto.memberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class MemberService {

    private memberDAO memberDAO;

    public List<memberDTO> selectAllMemberList() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        List<memberDTO> allMemberList = memberDAO.selectAllMemberList();

        sqlSession.close();

        return allMemberList;


    }

//    public memberDAO selectMemberByCode() {
//
//        SqlSession sqlSession = getSqlSession();
//
//        memberDAO memberlist = memberDAO.selectMemberByCode();
//
//        sqlSession.close();
//
//        return memberlist;
//    }

    public String selectMemberByCode(String memberCode) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(memberDAO.class);

        String memberList = memberDAO.selectMemberByCode(sqlSession);

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
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;


    }
}
