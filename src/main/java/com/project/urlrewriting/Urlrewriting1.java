package com.project.urlrewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/urlrewriting1")
public class Urlrewriting1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("nm");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> Name: " + name + "</h1>");
        out.println("<br> <a href='urlrewriting2?userName=" + name + "'>jump on servlet</a>");
    }
}
