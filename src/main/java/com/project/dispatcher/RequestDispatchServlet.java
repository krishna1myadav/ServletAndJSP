package com.project.dispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RequestDispatchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        RequestDispatcher rd;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if("email@gmail.com".equals(email) && "password".equals(password)){
            // redirect Home page
            rd = req.getRequestDispatcher("/secondservlet");
            rd.forward(req, resp);

        }else {
            //redirect login page
            out.print("<h4> invalid credancials</h4>");
            rd = req.getRequestDispatcher("/login.jsp");
            rd.include(req, resp);
        }
    }
}
