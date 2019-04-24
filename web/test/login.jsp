
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="../WEB-INF/js/jquery-1.7.2.js">
    $(function () {
        $("a").click(function () {
            $("img").attr("src","validcode?date="+new Date());
            return false;
        })
    })
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    用户名：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>
    验证码：<input type="text" size="10" />
    <img src="validcode" width="80" height="40"/>
    <a href="">看不清</a>
    <br>
    <input type="submit" value="登录"/>
    <input type="reset" value="重置"/>
    <br>
</form>
</body>
</html>
