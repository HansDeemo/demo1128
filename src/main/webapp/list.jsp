<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/28 0028
  Time: 下午 3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/page.js"></script>
</head>

<body>
<form action="list.do" method="post">
    <p>
        关键词:<input type="text" name="keyWord" value="${keyWord}">
        <input type="submit" value="查询">
    </p>
    <p>
    <h2>热点事件排行榜</h2>
    </p>
    <table border="1px solid black">
        <tr>
            <td>关键词</td>
            <td>搜索指数</td>
            <td>创建时间</td>
        </tr>

        <c:forEach items="${list}" var="list">
            <tr>
                <td>
                    <a href="javascript:void(0);"
                       onclick="javascript:window.location.href='findByHotEventsId.do?id=${list.id}'">
                            ${list.keyWord}
                    </a>
                </td>
                <td>${list.serchSum}</td>
                <td>
                    ${list.createDate}
                </td>
            </tr>
        </c:forEach>

        <tr>
            <td colspan="3">
                <input type="hidden" name="pageNo" value="${pageBean.pageNo}"/>
                <input type="hidden" name="totalPage" value="${pageBean.totalPage}"/>
                <a href="javascript:void(0);" onclick="javascript:first(1)">首页</a>
                <a href="javascript:void(0);" onclick="javascript:prev(${pageBean.pageNo})">上一页</a>
                <a href="javascript:void(0);" onclick="javascript:next(${pageBean.pageNo})">下一页</a>
                <a href="javascript:void(0);" onclick="javascript:last(${pageBean.totalPage})">末页</a>
                <a>第  ${pageBean.pageNo} 页/共 ${pageBean.totalPage} 页</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
