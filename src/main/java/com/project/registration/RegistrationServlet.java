package com.project.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String course = req.getParameter("course");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Name: " + name + "</h1>");
        out.println("<h1>Email: " + email + "</h1>");
        out.println("<h1>Password: " + password + "</h1>");
        out.println("<h1>Course: " + course + "</h1>");
    }
}
