
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示航班信息</title>
</head>
<body>
<c:forEach items="${list}" var="airport">
    <tr>${airport.portName}</tr>
    <tr>${airport.cityName}</tr>
</c:forEach>
</body>
</html>
