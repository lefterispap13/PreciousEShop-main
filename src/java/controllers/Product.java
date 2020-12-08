/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ProductService;
/**
 *
 * @author Home
 */

@WebServlet(name="product",urlPatterns={"/product"})
public class Product extends HttpServlet{
    ProductService productService;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(productService == null) productService=new ProductService();
        int result=productService.insert(new models.Product("Bruce",100,2));
//        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        showHtml("<p>Inserted Records for Products: "+result+"</p>",resp);        
    }
    
    protected void showHtml(String body,HttpServletResponse resp) throws IOException{
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
            out.println("</body>");
            out.println("</html>");
            
        }
    }
    
    
}
