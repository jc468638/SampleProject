package com.test.servlets;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/getServlet") PUT THIS LINE (and the necessary library) IF YOU DON'T SPECIFY the servlet IN web.xml file
//this is called configuration via annotations

public class GetServlet extends HttpServlet {
    @java.lang.Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("name");
        String htmlResponse = "<html><h3>Welcome to Servlets!</h3></html>";
        PrintWriter writer = resp.getWriter();
        writer.write(htmlResponse + " " + value);
    }
}
