package com.example.demoSQL.servlet;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.demoSQL.service.UserDao;
@WebServlet("/UserDeleteServlet")
public class UserDelete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            System.out.println(request.getParameter("id")+"-----------------");
           int result = UserDao.delete(request.getParameter("id"));
            if(result>0){
                System.out.println(result+"success");
             }else{
                 System.out.println("fail");
             }
        
        doPost(request,response);
}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;
        
            request.setAttribute("userList", UserDao.getAllUsers());
        page = "/login.jsp";
        getServletContext().getRequestDispatcher(page).forward(request,response);
    }
}
