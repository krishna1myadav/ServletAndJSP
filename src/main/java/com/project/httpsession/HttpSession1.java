package com.project.httpsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/httpsession1")
public class HttpSession1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("nm");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h1> Name: " + name + "</h1>");

        HttpSession session = req.getSession();
        session.setAttribute("userName", name);

        out.println("<a href='httpsession2'>Servlet2</a>");
    }
}
