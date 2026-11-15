package com.project.hiddenform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hiddenform1")
public class HiddenForm extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("nm");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<form action='hiddenform2'><input type='hidden' name='user' value='"+name+"'><br><button type='submit'>Servlet 2</button></form>");
    }
}
