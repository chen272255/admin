package com.neu.service;

import com.neu.dao.impl.BvoInfoDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bvoInfo.do")
public class BvoInfoServlet extends HttpServlet {
    static BvoInfoDaoImpl binfo = new BvoInfoDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
