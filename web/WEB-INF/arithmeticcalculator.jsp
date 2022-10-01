<%-- 
    Document   : arithmeticcalculator
    Created on : 30-Sep-2022, 5:34:01 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <div>
                <label>First: </label>
                <input type="text" name="first_arithmetic" value="${firstArithmetic}">
            </div>
            <div>
                <label>Second: </label>
                <input type="text" name="second_arithmetic" value="${secondArithmetic}">
            </div>
            <div>
                <input type="submit" value="+" name="calculate">
                <input type="submit" value="-" name="calculate">
                <input type="submit" value="*" name="calculate">
                <input type="submit" value="%" name="calculate">
            </div>
            <div>
                <p>
                    Result: ${message} ${result}
                </p>
            </div>
                <div>
                    <a href="age">Age Calculator</a>
        </form>
    </body>
</html>