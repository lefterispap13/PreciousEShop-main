/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ProductService;
import services.ResultService;
/**
 *
 * @author Home
 */

@WebServlet(name="product",urlPatterns={"/product"})
public class Product extends HttpServlet{
    ProductService productService;
    ResultService resultService;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if(productService == null) productService=new ProductService();
//        int result=productService.insert(new models.Product("Bruce",100,2));
////        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
//        showHtml("<p>Inserted Records for Products: "+result+"</p>",resp); 
        RequestDispatcher rd =req.getRequestDispatcher("/WEB-INF/views/newproduct.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        if(productService ==null) productService=new ProductService();
        if(resultService == null) resultService=new ResultService();
        models.Product product=new models.Product();
        product.setName(req.getParameter("name"));
        product.setPrice(Double.parseDouble(req.getParameter("price")));
        product.setQuantity(Integer.parseInt(req.getParameter("quantity")));
        int result = productService.insert(product);
        resultService.showInsertResult(req, resp, result, product);
        

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
