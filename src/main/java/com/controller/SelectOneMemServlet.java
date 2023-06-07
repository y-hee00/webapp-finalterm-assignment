package com.controller;

import com.model.dto.memberDTO;
import com.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet("/member/select")
public class SelectOneMemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String memberCode = request.getParameter("memberCode");

        System.out.println("memberCode : " + memberCode);

        MemberService memberService = new MemberService();
        String selectMember = memberService.selectMemberByCode(memberCode);

        System.out.println("selectMember : " + selectMember);

        String path = "";
        if(selectMember != null){
            path = "/WEB-INF/views/common/showMemberInfo.jsp";
            request.setAttribute("selectMember", selectMember);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "환자 정보 조회 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }


}
