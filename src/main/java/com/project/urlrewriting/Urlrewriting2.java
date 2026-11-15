package com.project.urlrewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/urlrewriting2")
public class Urlrewriting2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> Name: " + userName + "</h1>");
    }

}
