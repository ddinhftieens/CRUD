package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DAO.*;
import model.*;

@WebServlet(name = "Servletviewallcustomer", urlPatterns = {"/viewallcustomer"})
public class Servletviewallcustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<customer> customerList = JDBC.getAllcustomer();
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("/template/showallcustomer.jsp").include(request,response);
    }
}
