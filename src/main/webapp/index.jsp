<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="post" type="com.epam.vb.entity.Blog.model.Post"--%>
<%--@elvariable id="blog" type="com.epam.vb.entity.Blog.model.Blog"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
</head>
<body>
<h1>author : ${blog.author.firstName}</h1>
<h2>title : ${blog.title}</h2>



</body>
</html>
