<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register</h1>
<div>
    <form action="<c:url value="register.jsp"/> "method="post">
    <div>First Name: <input type="text" name="firstName" placeholder="First name" /></div>
    <div>Last Name: <input type="text" name="lastName" placeholder="Last name" /></div>
    <div>Email: <input type="text" name="email" placeholder="Email" /></div>
    <div>Password: <input type="password" name="password" placeholder="Input your password"/> </div>
    <button type="submit">Register</button>
    </form>
</div>
</body>
</html>
