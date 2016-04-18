<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>User page</title>
</head>
<body style="margin:0">

<div style="width: 100%; height: calc(100% - 70%); background: #008B8B;background-size: cover;text-align: center; padding-top:10px;">
  <form method="POST">
    Name<br>
    <input type="text" name="userName"/><br>
    Email<br>
    <input type="text" name="userEmail"/><br>
    <input type="submit" value="add"/>
  </form>
</div>

<div style="width: 100%; height: 70%;background: #F5F5F5;">
  <table border="2" ; align="center">
    <c:forEach items="${users}" var="user">
      <tr>
        <td>
          <c:out value="${user}"/>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>