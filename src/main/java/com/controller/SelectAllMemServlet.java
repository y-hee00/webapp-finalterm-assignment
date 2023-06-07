package com.controller;

import com.model.dto.memberDTO;
import com.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/member/list")
public class SelectAllMemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MemberService memberService = new MemberService();
        List<memberDTO> memberlist = memberService.selectAllMemberList();

        for(memberDTO member : memberlist){
            System.out.println(member);
        }

        String path = "";
        if(memberlist != null){
            path = "/WEB-INF/views/member/memberList.jsp";
            request.setAttribute("memberlist", memberlist);
        } else {
            path="/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "환자 목록 조회 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }


}