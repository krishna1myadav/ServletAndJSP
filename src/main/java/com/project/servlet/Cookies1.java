package com.project.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet11")
public class Cookies1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fn = (req.getParameter("fn"));
        String sn = (req.getParameter("sn"));

        String full = fn + sn;

        Cookie ck = new Cookie("s", full);
        resp.addCookie(ck);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> wecome to servlet1 , name = " + full + "</h1");

        out.println("<br> <a href='servlet12'>jump on other servlet</a>");
    }
}
