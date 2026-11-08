package com.project.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ParAndAttrServlet")
public class ParAndAttriServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int fn = Integer.parseInt(req.getParameter("fn"));
        int sn = Integer.parseInt(req.getParameter("sn"));

        int sum = fn + sn;

        req.setAttribute("s", sum);

        RequestDispatcher rd = req.getRequestDispatcher("/ParAndAttrServlet2");
        rd.forward(req, resp);
    }
}
