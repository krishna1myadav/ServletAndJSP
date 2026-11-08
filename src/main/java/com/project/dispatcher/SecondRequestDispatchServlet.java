package com.project.dispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SecondRequestDispatchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");



        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("user: " + email + "<h1>Welcome to home page😂</h1>");
        out.println();
        out.println("your password is: " + password);
    }
}
