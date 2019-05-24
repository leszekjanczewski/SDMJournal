<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dodaj użytkownika</title>
</head>
<body>
    <h1>Dodaj użytkownika</h1>
    <form:form method="post">
        Imię użytkownika: <input type="text" name="firstName">
        Nazwisko użytkownika: <input type="text" name="lastName">
        Login (z SWD): <input type="text" name="login">
        Hasło (wymyśl): <input type="password" name="password">
        <br>
        <input type="submit">
    </form:form>
</body>
</html>
