package com.controller;

import com.model.dto.memberDTO;
import com.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet("/member/update")
public class UpdateMemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String memberCode = request.getParameter("memberCode");
        String birthDate = request.getParameter("birthDate");
        String phone = request.getParameter("phone");
        String activeStatus = request.getParameter("activeStatus");

        memberDTO member = new memberDTO();
        member.setMemberCode(memberCode);
        member.setBirthDate(birthDate);
        member.setPhone(phone);
        member.setActiveStatus(activeStatus);

        int result = new MemberService().modifyMember(member);

        String path = "";
        if(result > 0){
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "updateMember");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "환자 정보 수정 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
