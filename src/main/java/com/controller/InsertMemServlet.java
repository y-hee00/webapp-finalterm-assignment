package com.controller;

import com.model.dto.memberDTO;
import com.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/member/insert")
public class InsertMemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String memberCode = request.getParameter("memberCode");
        String memberName = request.getParameter("memberName");
        String birthDate = request.getParameter("birthDate");
        String gender = request.getParameter("gender");
        String detailInfo = request.getParameter("detailInfo");
        String phone = request.getParameter("phone");
        String teamCode = request.getParameter("teamCode");
        String activeStatus = request.getParameter("activeStatus");



        memberDTO member = new memberDTO();

        member.setMemberCode(memberCode);
        member.setMemberName(memberName);
        member.setBirthDate((birthDate).replaceAll("-", ""));
        member.setGender(gender);
        member.setDetailInfo(detailInfo);
        member.setPhone(phone);
        member.setTeamCode(teamCode);
        member.setActiveStatus(activeStatus);

        int result = new MemberService().registNewMember(member);

        String path = "";
        if(result > 0){
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "insertMember");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "입원환자 정보 등록 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);


    }
}
