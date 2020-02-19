package com.example.demoSQL.service;

import java.io.IOException;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @create 2020/02/18 21:31.
 */
@Stateless
public class LogOutServiceImpl implements LogOutService{

    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute("id");
            session.removeAttribute("userId");
        }

        response.sendRedirect(request.getContextPath() + "/login");
    }
}
