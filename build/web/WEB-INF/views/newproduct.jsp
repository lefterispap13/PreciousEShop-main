<%-- 
    Document   : newproduct
    Created on : Dec 9, 2020, 10:02:05 AM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Product - Precious EShop</title>
    </head>
    <body>
        <h1>New Product Data</h1>
        <form name="newproduct" action="<%= request.getContextPath() %>/product" method="POST">
            Name:            <input type="text" name="name" value="" /><br>
            Price:           <input type="text" name="price" value="" size="4" maxlength="4"/><br>
            Quantity:        <input type="text" name="quantity" value="" size="3" /><br>
            <input type="submit" value="Save Product" name="saveproduct"/>
        </form>
    </body>
</html>

