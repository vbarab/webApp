<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="post" type="com.epam.vb.entity.Blog.model.Post"--%>
<%--@elvariable id="blog" type="com.epam.vb.entity.Blog.model.Blog"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
</head>
<body>
<h1>Blog Title:${blog.title}</h1>

<h2>Blog Author:${blog.author}</h2>

<div>
    <p>${post.title}</p>
</div>
<div>
    <c:forEach items="${blog.postList}" var="post">
        <div><h1>Author:${post.authorName}</h1> </div>
    </c:forEach>
</div>
</body>
</html>
