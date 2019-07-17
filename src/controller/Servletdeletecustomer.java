package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import DAO.*;

@WebServlet(name = "Servletdeletecustomer", urlPatterns = {"/deletecustomer"})
public class Servletdeletecustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("ID");
        int ID = Integer.parseInt(id);
        System.out.println(ID);
        JDBC.delete(ID);
        response.sendRedirect("/viewallcustomer");
    }
}
