<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>SDM Dziennik</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/font-awesome.min.css"/>">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
</head>
<body>

<div class="container-fluid bg-info" style="color: aliceblue">
    <div class="row">
        <div class="col-md-3">
            <%= (new java.util.Date()).toString()%>
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

<div class="row">
    <div class="col-lg-1">
        <img class="img-fluid my-2" style="height: 90px; width: 90px"
             src="<c:url value="/resources/images/logo.png"/>"
             alt="Państwowe Ratownictwo Medyczne"/>
    </div>
    <div class="col-lg-3 my-2">
        <h1 style="color: blue;">SDM Dziennik</h1>
    </div>
    <div class="col-lg-8 my-2">
        <%--<form:form method="post" modelAttribute="user" class="form-inline" action="/login">
            <div class="form-group input-group">
                <div class="input-group-prepend">
                        <span class="input-group-text">
                            <i class="fa fa-user"></i>
                        </span>
                </div>
                <form:input path="login" class="form-control" type="text" name="login" placeholder="takie jak do SWD">
            </div>
            &lt;%&ndash;<label for="user-name-label">Użytkownik</label>&ndash;%&gt;
            <div class="form-group input-group">
                <div class="input-group-prepend">
                        <span class="input-group-text">
                            <i class="fa fa-lock"></i>
                        </span>
                </div>
                <form:password path="password" class="form-control" type="password" name="userPassword" placeholder="hasło">
            </div>
            <button class="btn btn-primary" type="button">Zaloguj</button>
        </form:form>--%>
    </div>
</div>

<%-- FOOTER START --%>
<footer class="footer text-center fixed-bottom mb-2">
    <p class="text-muted">
        <small>&copy; ROBO-US Leszek Janczewski</small>
    </p>
    <p class="text-muted">
        <small>Terms &amp;Conditions</small>
    </p>
    <p class="text-muted">
        <small>O nas</small>
    </p>
</footer>
<%-- FOOTER END --%>

<!-- for bootstrap v4.3.1 - start -->
<script src="<c:url value="/resources/js/jquery-3.3.1.slim.min.js"/>"></script>
<script src="<c:url value="/resources/js/popper.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<!-- for bootstrap - end -->
</body>
</html>