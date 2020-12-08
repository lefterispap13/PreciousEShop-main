/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.CustomerService;


/**
 *
 * @author Home
 */
@WebServlet(name="customer",urlPatterns={"/customer"})
public class Customer extends HttpServlet{
    CustomerService customerService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(customerService == null) customerService=new CustomerService();
        int result=customerService.insert(new models.Customer("Bruce","Lee","2222","bruce@kick.com"));
//        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
         resp.setContentType("text/html;charset=UTF-8"); // servlet
        try (PrintWriter out = resp.getWriter()) {
            /* for the browser */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Precious EShop</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Login - Precious EShop" + "</h1>");
            out.println("<p>Inserted Customer: "+result+"</p>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }
       
}
