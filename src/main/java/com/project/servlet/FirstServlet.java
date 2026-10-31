package com.project.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FirstServlet implements Servlet {
    ServletConfig con;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method is working........");
        con = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig method is working........");
        return con;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method is working........");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("Welcome to the servlet ! ");
        out.println("Today " + new Date().toString());
        System.out.println(getServletConfig());
        System.out.println(getServletInfo());
    }

    @Override
    public String getServletInfo() {
        return "getServletInfo method is working........";
    }

    @Override
    public void destroy() {
        System.out.println("destroy method is working........");
    }
}
