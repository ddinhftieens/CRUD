package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import DAO.*;
import model.customer;

@WebServlet(name = "Servletsavecustomer",urlPatterns = {"/savecustomer"})
public class Servletsavecustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        String mail = request.getParameter("email");
        String country = request.getParameter("country");
        JDBC.save(new customer(name,pass,mail,country));
        request.getRequestDispatcher("index.jsp").include(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
