<html>
<body>
  <% String visitor = request.getParameter("name");
     if (visitor == null) visitor = "World"; %>

  <h1>Hello <%= visitor%>!</h1>

  <p>To see how request parameter will be included in this page type ".../servlet_jsp_demo/hello_visitor.jsp?name=your_name" in a browser</p>

  <br>
  <br>
  <a href="/servlet_jsp_demo/index.html">Back home</a>
</body>
</html>

