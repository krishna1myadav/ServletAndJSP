package com.project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("servlet1")
public class Cookies extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int fn = Integer.parseInt(req.getParameter("fn"));
        int sn = Integer.parseInt(req.getParameter("sn"));

        int sum = fn + sn;
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> wecome to servlet1 , name = " + sum + "</h1");

        out.println("<br> <a href='ParAndAttrServlet2'>jump on other servlet</a>");
    }
}
