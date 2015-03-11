<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="post" type="com.epam.vb.entity.Blog.model.Post"--%>
<%--@elvariable id="blog" type="com.epam.vb.entity.Blog.model.Blog"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
</head>
<body>
<h1>${blog.author}</h1>
<h2>title${blog.title}</h2>
<h3>post : ${post.title}</h3>


</body>
</html>
