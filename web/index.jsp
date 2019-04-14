<%--
  Created by IntelliJ IDEA.
  User: tranchung
  Date: 14/04/2019
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary Servlet</title>
  </head>
  <body>
 <form method="post" action="${pageContext.request.contextPath}/Dictionary">
   <h1>Vietnamese Dictionary</h1><br>
   <input type="text" name="word" placeholder="Enter your word" size="15"/>
   <input type="submit" value="Search"/>
 </form>
  </body>
</html>
