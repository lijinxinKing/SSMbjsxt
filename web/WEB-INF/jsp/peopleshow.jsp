<%@ page import="ssm.pojo.People" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示 全部 人</title>
</head>
<body>

<table border="1px">
    <tr>
        <span> 显示全部人名</span>
    </tr>
    <tr>
        <td>Id</td>
        <td>名字</td>
        <td>年龄</td>
    </tr>
    <tr>
        <% People pp = (People)request.getAttribute("people");
            if(pp!=null) {%>
                <tr>
                    <td><%=pp.getId()%></td>
                    <td><%=pp.getName()%></td>
                    <td><%=pp.getAge()%></td>
                </tr>
        <%}%>
    </tr>
</table>
</body>
</html>
