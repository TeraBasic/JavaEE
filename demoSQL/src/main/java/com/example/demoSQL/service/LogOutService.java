package com.example.demoSQL.service;

import java.io.IOException;
import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Local
public interface LogOutService {
     void logout(HttpServletRequest request, HttpServletResponse response) throws IOException;
}