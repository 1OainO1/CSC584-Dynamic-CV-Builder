<%-- 
    Document   : cvError
    Created on : 11 Nov 2026, 9:39:52 am
    Author     : User A
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Validation Error</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <div class="error-container">
            <h2>Form Submission Error</h2>
            <p class="error-msg">
                <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "Invalid Input!" %>
            </p>
            <a href="cvForm.jsp" class="btn-back">Go back & Correct Form</a>
        </div>
    </body>
</html>
