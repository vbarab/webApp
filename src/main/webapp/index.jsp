<%--@elvariable id="post" type="com.epam.vb.entity.Blog.model.Post"--%>
<%--@elvariable id="blog" type="com.epam.vb.entity.Blog.model.Blog"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<fmt:bundle basename="messages">
<head>
    <title>Blog</title>
</head>
<body>
<div>
    <c:forEach items="${blog.postList}" var="post">
    <c:if test="${!post.deleted}">
          <h1> <fmt:message key="title"></fmt:message> : ${post.title}</h1>
        <h2><fmt:message key="author"></fmt:message> :  ${post.author.firstName}</h2>
       <div> <p> ${post.description}</p></div>
    </c:if>
    </c:forEach>
</div>

</body>
    </fmt:bundle>
</html>
