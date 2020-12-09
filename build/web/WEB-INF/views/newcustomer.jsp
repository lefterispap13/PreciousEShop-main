<%-- 
    Document   : newcustomer
    Created on : Dec 9, 2020, 9:59:13 AM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Customer - Precious EShop</title>
    </head>
    <body>
        <h1>New Customer</h1>
        <form name="newcustomer" action="/customer" method="POST">
            <input type="text" name="first name" value="" />
            <input type="text" name="last name" value="" />
            <input type="text" name="tel" value="" />
            <input type="text" name="email" value="" />
        </form>  
    </body>
</html>

