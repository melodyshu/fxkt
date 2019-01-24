<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<c:out value="${name}"></c:out>
<c:forEach items="${cityList}" var="city">
    ${city.id}-${city.name}<br/>
</c:forEach>
</body>
</html>
