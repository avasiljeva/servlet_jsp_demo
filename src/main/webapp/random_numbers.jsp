<html>
<body>
<H1>Random number generator</H1>
<%!
private double randomNumber() {
   return Math.random();
}
%>
<%
   double randomNumber1 = randomNumber();
   double randomNumber2 = randomNumber();
   double sum = randomNumber1 + randomNumber2;
%>

First random number: <%= randomNumber1 %> <br>
Second random number: <%= randomNumber2 %> <br>
Sum: <%= sum %>

  <br>
  <br>
  <a href="/servlet_jsp_demo/index.html">Back home</a>

</body>
</html>

