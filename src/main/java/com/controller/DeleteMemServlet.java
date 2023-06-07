package com.controller;

import com.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.Map;

@WebServlet("/member/delete")
public class DeleteMemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        int memberCode = Integer.parseInt(request.getParameter("memberCode"));

        int result = new MemberService().deleteMember(memberCode);

        String path = "";
        if(result > 0){
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "deleteMember");
        } else {
            path="/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message","환자 정보 삭제 실패");
        }



    }
}
