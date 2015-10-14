<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h4>Persons</h4>
<a href="./create">create</a>
<c:forEach items="${people}" var="person">
   <p>* <c:out value="${person.firstName}"/></p>
</c:forEach>
</body>
</html>
