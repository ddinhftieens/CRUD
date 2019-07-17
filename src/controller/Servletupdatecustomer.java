package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.*;
import DAO.*;

@WebServlet(name = "Servletupdatecustomer",urlPatterns = {"/updatecustomer"})
public class Servletupdatecustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String id = request.getParameter("ID");
        int ID = Integer.parseInt(id);
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        String mail = request.getParameter("email");
        String country = request.getParameter("country");
        customer cs = new customer();
        cs.setID(ID);
        cs.setName(name);
        cs.setPass(pass);
        cs.setMail(mail);
        cs.setCountry(country);
        JDBC.update(cs);
        response.sendRedirect("/viewallcustomer");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
