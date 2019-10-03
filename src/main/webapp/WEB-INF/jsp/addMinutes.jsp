<%-- 
    Document   : addMinutes
    Created on : Oct 3, 2019, 4:58:12 PM
    Author     : User01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Minutes Page</title>
    </head>
    <body>
        <h1>Add Minutes Exercised</h1>
        <form:form modelAttribute="exercise">
            <table>
                <tr>
                    <td>Minutes Exercise For Today:</td>
                    <td><form:input path="minutes"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Enter Exercise"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
