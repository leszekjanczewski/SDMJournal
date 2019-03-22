<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>SDM Dziennik</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/font-awesome.min.css"/>">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    ">
</head>
<body>
<div class="container-fluid bg-info" style="color: aliceblue">
    <div class="row">
        <div class="col-md-3">
            <%= (new java.util.Date()).toLocaleString()%>
        </div>
        <div class="col-md-3">
            <%
                String userName = (String) request.getSession().getAttribute("username");
                if (userName != null) {
                    out.print(userName);
                } else {
                    out.print("Nie zalogowano");
                }
            %>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-1">
            <img class="img-fluid my-2" style="height: 90px; width: 90px" src="<c:url value="/resources/images/logo.png"/>"
                 alt="Państwowe Ratownictwo Medyczne"/>
        </div>
        <div class="col-lg-3 my-2">
            <h1 style="color: blue;">SDM Dziennik</h1>
        </div>
        <div class="col-lg-8 my-2">
            <form class="form-inline" action="/login">
                <%--<label for="user-name-label">Użytkownik</label>--%>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon">
                    <i class="fa fa-user"></i>
                    </span>
                    <input class="form-control" type="text" name="userName" placeholder="takie jak do SWD">
                </div>
                <div class="input-group input-group-lg">
                        <span class="input-group-addon">
                            <i class="fa fa-lock"></i>
                        </span>
                    <input class="form-control" type="password" name="userPassword" placeholder="hasło">
                </div>
                <button class="btn btn-primary" type="button">Zaloguj</button>
            </form>
        </div>
    </div>
</div>
<div class="row">
    <div class="input-group input-group-lg">
  <span class="input-group-addon">
    <i class="fa fa-envelope"></i>
  </span>
        <input class="form-control" type="text" placeholder="Email address">
    </div>
    <div class="input-group input-group-lg">
  <span class="input-group-addon">
    <i class="fa fa-lock"></i>
  </span>
        <input class="form-control" type="password" placeholder="Password">
    </div>
</div>
<div class="row">ROW 3</div>

<h1 class="">SDM Dziennik</h1>
<%
    out.println("Your IP address is " + request.getRemoteHost());
%>
<a href="<c:url value="/login"/>">Login</a>

<!-- for bootstrap - start -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- for bootstrap - end -->
</body>
</html>