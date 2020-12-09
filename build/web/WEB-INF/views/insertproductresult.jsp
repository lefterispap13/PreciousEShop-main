<%-- 
    Document   : errorinsertproduct
    Created on : Dec 9, 2020, 1:18:55 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! 
    boolean isError; 
    String errMsg;
%>
<% 
    isError = (boolean)request.getAttribute("isError");
%>
<% 
    isError = (boolean)request.getAttribute("isError");
    if(isError)
        errMsg="error";
    else
        errMsg ="success";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Insert Product - <%= request.getContextPath() %></title>
    </head>
    <body>       
        <h1>Result Insert Product</h1>
        <div class="<%= errMsg %>">
            <p><h4><%= errMsg.toUpperCase() %> Code.....: <%= request.getAttribute("errorCode")%></h4> </p>
            <p><h4><%= errMsg.toUpperCase() %> Message..: <%= request.getAttribute("errorMessage")%></h4> </p>
            <p><h4>On Product...: <%= request.getAttribute("product")%></h4> </p>
        </div>
        <div class="redirect">
            <!-- Link to the newproduct.jsp == /product
              h'  button to the newproduct.jsp == /product -->
            <a href="<%= request.getContextPath() %>">Visit Home Page</a>
        </div>
    </body>
</html>
