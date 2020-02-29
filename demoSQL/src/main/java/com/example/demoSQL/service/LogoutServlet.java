package com.example.demoSQL.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "logoutServlet", urlPatterns = "/logout")  //标记为servlet，以便启动器扫描。
public class LogoutServlet extends HttpServlet{
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute("id");
            session.removeAttribute("userId");
        }
        response.sendRedirect(request.getContextPath() + "/login");
    }
    

}
