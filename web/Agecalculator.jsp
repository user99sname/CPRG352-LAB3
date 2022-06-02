<%@page import="javax.servlet.annotation.WebServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

</head>
<body>    
    <h2>Age Calculator</h2>
    <form action="age" method="post">
       <label> Enter your age:</label>
       <input type=text name=age value="${age}"></input><br/>
       <input type=submit value="Age Next Birthday" /><br/>
      <br/>
         </form>
    <div> ${message}</div>
       <a href=Arithmeticcalculator.jsp>Arithmetic Calculator</a>
       <br/>

</body>
</html>