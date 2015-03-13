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
    <fmt:message key="hello"></fmt:message>
</div>

<h1><fmt:message key="author"></fmt:message> : ${blog.author.firstName}</h1>
<h2><fmt:message key="title"></fmt:message> : ${blog.title}</h2>
<div>
    <c:forEach items="${blog.postList}" var="post">
    <c:if test="${!post.deleted}">
          <h1>${post.title}</h1>
        <h2>${post.authorName}</h2>
        ${post.description}
    </c:if>
    </c:forEach>
</div>

</body>
    </fmt:bundle>
</html>
