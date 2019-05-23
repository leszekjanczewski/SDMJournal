<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>">
    <title>DM Dziennik</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/jumbotron.css"/>">
</head>

<body>
<nav class="navbar navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <img class="navbar-left" style="height: 1em; width: 1em"
                 src="<c:url value="/resources/images/logo.png"/>"
                 alt="Państwowe Ratownictwo Medyczne"/>
            <a class="navbar-brand" href="#">DM Dziennik</a>
            <p class="navbar-brand"> <%= (new java.util.Date().toString())%> </p>
            <p class="navbar-brand">
            <%
                String userName = (String) request.getSession().getAttribute("username");
                if (userName != null) {
                    out.print(userName);
                } else {
                    out.print("Nie zalogowano");
                }
            %>
            </p>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form:form class="navbar-brand navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" placeholder="Email" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Zaloguj się</button>
            </form:form>
        </div><!--/.navbar-collapse -->
    </div>
</nav>

<%-- Main content --%>
<div class="container jumbotron">

</div>

<%-- FOOTER START --%>
<%@include file="../templates/footer.jspf"%>
<%-- FOOTER END --%>

<!-- for bootstrap v4.3.1 - start -->
<script src="<c:url value="/resources/js/jquery-3.3.1.slim.min.js"/>"></script>
<script src="<c:url value="/resources/js/popper.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</body>
</html>