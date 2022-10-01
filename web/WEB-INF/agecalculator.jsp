<%-- 
    Document   : agecalculator
    Created on : 30-Sep-2022, 3:41:24 PM
    Author     : Elle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <div>
                <label>Enter your age: </label>
                <input type="text" name="input_age" value="${inputAge}">
            </div>
            <div>
                <input type="submit" value="Age next birthday">
            </div>
            <div>
                <p>
                    ${message} ${string} ${result} ${error}
                </p>
            </div>
                <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>