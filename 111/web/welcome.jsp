<%@ page import="com.UserBean" %><%--
  Created by IntelliJ IDEA.
  User: Lijunlin
  Date: 2022/10/12
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功！</title>
    <link rel="stylesheet" type="text/css" href="css/Register.css">
</head>
<body>

<%
    UserBean user1= (UserBean) getServletConfig().getServletContext().getAttribute("now");
%>
<div ">
    <div class="divXia" align="center">
        <h1>欢迎您！</h1>
        <h2><%=user1.getLoginid()%></h2>
    </div>
</div>
</body>
</html>
