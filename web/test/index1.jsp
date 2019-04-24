
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<script type="text/javascript" src="../WEB-INF/js/jquery-1.7.2.js">
</script>
<script type="text/javascript">
    $(function () {
        var pageSize = "${pageInfo.pageSize}";
        alert(pageSize);
        var pageNumber = ${pageInfo.pageNumber};
        var tname = $(pageInfo.tname);
        var sname = $(pageInfo.sname);
        var total = $(pageInfo.total);

        // n 是dom对象，js对象,把dom 对象转换成 jquery对象
        $.each($(":radio"),function (i,n) {
            if($(n).val()==pageSize){
                $(n).attr("checked","checked");
            }
        })
        $(":text[name='sname']").val(sname);
        $(":text[name='tname']").val(tname);
    })
    $("button").click(function () {
        location.href="/student?pageSize="+pageSize+"&pageNumber=1"+"&tname="+$(":text[name=tname]").val()+"&sname="+$(":text[name=sname]").val();
    })
    $(":radio").click(function () {
        pageSize = $(this).val();
        location.href="/student?pageSize="+pageSize+"&pageNumber=1"+"&tname="+$(":text[name=tname]").val()+"&sname="+$(":text[name=sname]").val();
    })
    //点击上一页
    $(".page_a:eq(0)").click(function () {
        pageNumber = parseInt(pageNumber) -1;
        if(pageNumber>=1){
            location.href="/student?pageSize="+pageSize+"&pageNumber="+pageNumber+"&tname="+$(":text[name=tname]").val()+"&sname="+$(":text[name=sname]").val();
        }else{
            pageNumber=1;
        }
        return false;
    })
    $(".page_a:eq(1)").click(function () {
        pageNumber = parseInt(pageNumber)+1;
        if (pageNumber * pageSize > total){
            pageNumber = total/pageSize;
        }else{
            location.href="/student?pageSize="+pageSize+"&pageNumber="+pageNumber+"&tname="+$(":text[name=tname]").val()+"&sname="+$(":text[name=sname]").val();
        }
        return false;
    })
</script>
  <head>
    <title>显示学生 老师 信息</title>
  </head>
  <body>
    <input type="radio" value="2" name="pageSize">2
    <input type="radio" value="3" name="pageSize">3
    <input type="radio" value="4" name="pageSize">4
    <input type="radio" value="5" name="pageSize">5
    <br>
    学生姓名:<input type="text" name="sname">
    老师姓名:<input type="text" name="tname">
     <button>查询</button>
    <table border="1">
      <tr>
          <td>学生学号</td>
          <td>学生姓名</td>
          <td>年龄</td>
          <td>老师姓名</td>
      </tr>
      <c:forEach items="${pageInfo.list}" var="stu">
          <tr>
              <td>${stu.id}</td>
              <td>${stu.name}</td>
              <td>${stu.age}</td>
              <td>${stu.teacher.name}</td>
          </tr>
      </c:forEach>
    </table>
  <a href="" class="page_a">上一页</a>
  <a href="" class="page_a">下一页</a>
  </body>
</html>
