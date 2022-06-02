<%@page import="javax.servlet.annotation.WebServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

</head>
<body>
   <form action="age">
       <h2>Age Calculator</h2>
       <label> Enter your age:</label>
       <input type=text name=age id=age></input><br/>
       <input type=submit value=AgeNextBirthday /><br/>
      <br/>
      
       <a href=arithmaticcalculator.jsp>Arithmetic Calculator</a>
       <br/>
   </form>
</body>
</html>