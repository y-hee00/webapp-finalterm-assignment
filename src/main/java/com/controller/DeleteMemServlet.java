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

        int memberCode = Integer.parseInt(request.getParameter("memberCode"));
        System.out.println("삭제성공1");
        int result = new MemberService().deleteMember(memberCode);
        System.out.println("삭제성공2");

        String path = "";
        if(result > 0){
            System.out.println("삭제성공3");
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "deleteMember");
            System.out.println("삭제성공4");
        } else {
            path="/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message","환자 정보 삭제 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }
}
