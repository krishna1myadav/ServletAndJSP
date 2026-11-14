package com.project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet12")
public class Session extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("s");
        PrintWriter out = resp.getWriter();

        Cookie[] ck  = req.getCookies();

        resp.setContentType("text/html");
        out.println("<br> <h1> welcome to servlet2 " + name + "</h1>");
        out.println("<br> <h1> welcome to servlet2 " + ck[0].getValue() + "</h1>");
    }
}
