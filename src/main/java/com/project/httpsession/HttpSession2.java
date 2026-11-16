package com.project.httpsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/httpsession2")
public class HttpSession2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("userName");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h1> Name: " + name + "</h1>");
    }
}
