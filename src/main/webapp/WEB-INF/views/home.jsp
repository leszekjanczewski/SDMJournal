<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int day = 3; %>
<html>
<head>
    <title>SDM Dziennik</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    ">
</head>
<body>
<div class="container-fluid bg-info">
    <div class="row">
        <%= (new java.util.Date()).toLocaleString()%>  | Zalogowany użytkownik:
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <img class="img-fluid" src="<c:url value="/resources/images/logo.png"/>"
                 alt="Państwowe Ratownictwo Medyczne"/>
        </div>
        <div class="col-md-4">
            <h1 style="color: blue; font-weight: bold">SDM Dziennik</h1>
        </div>
        <form action="/login">
            <label for="user-name-label"></label>
            <input class="form-control" type="text" id="user-name-label">
            <label for="password-label"></label>
            <input class="form-control" type="password" id="password-label">
            <button class="button" type="submit">Zaloguj</button>
        </form>
    </div>
</div>
<div class="row">ROW 2</div>
<div class="row">ROW 3</div>

<h1 class="">SDM Dziennik</h1>
<%
    out.println("Your IP address is " + request.getRemoteHost());
%>

<% if (day == 1 || day == 7) { %>
<p> Today is weekend</p>
<% } else { %>
<p> Today is not weekend</p>
<% } %>

<a href="<c:url value="/login"/>">Login</a>

<!-- for bootstrap - start -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- for bootstrap - end -->
</body>
</html>