package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import DAO.*;
import model.*;

@WebServlet(name = "Servleteditcustomer", urlPatterns = {"/editcustomer"})
public class Servleteditcustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("ID");
        int ID = Integer.parseInt(id);
        customer cs = JDBC.getCustomer(ID);
        request.setAttribute("customer",cs);
        request.getRequestDispatcher("/template/update.jsp").include(request,response);
    }
}
