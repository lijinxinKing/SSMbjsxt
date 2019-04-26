<%@ page import="ssm.pojo.PageInfo" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/18/2019
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分页显示数据</title>
</head>
<body>
 <table border="1px">
     <tr>
         <td>ID</td>
         <td>名字</td>
         <td>年龄</td>
     </tr>
     <c:forEach items="${pageInfo.list}" var="pi">
         <tr>
             <td>${pi.id}</td>
             <td>${pi.name}</td>
             <td>${pi.age}</td>
         </tr>
     </c:forEach>
     <a href="people?pageNumber=${pageInfo.pageNumber-1}&pageSize=${pageInfo.pageSize}"
        <c:if test="${pageInfo.pageNumber <=1}">
            onclick="javascript:return false;"
        </c:if>>上一页</a>
     <a href="people?pageNumber=${pageInfo.pageNumber+1}&pageSize=${pageInfo.pageSize}"
     <c:if test="${pageInfo.pageNumber >= pgeInfo.total}">
         onclick="javascript:return false;"
     </c:if>
     >下一页</a>
 </table>
</body>
</html>
