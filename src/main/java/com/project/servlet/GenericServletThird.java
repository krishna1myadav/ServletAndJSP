package com.project.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class GenericServletThird extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Generic Servlet was running......");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("Date : " + new Date().toString());
    }
}
