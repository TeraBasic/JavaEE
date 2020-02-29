package com.example.demoSQL.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

@WebServlet(name = "firstServlet", urlPatterns = "/login2")
public class Login extends HttpServlet{
	@Autowired
    private UserDao userDao;
	@Autowired
    LogInService loginService;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("id");
        String password = request.getParameter("password");
        boolean isValidUser =loginService.validateUser(email, password);
        
        String destPage = "login.jsp";
         
        if (isValidUser) {
        	//return "redirect:/login";
        } else {
            String message = "Invalid email/password";
            request.setAttribute("message", message);
        }
         
        RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
        dispatcher.forward(request, response);
       
    }
}
