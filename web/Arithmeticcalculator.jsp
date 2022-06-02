
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h2>Arithmetic Calculator</h2>
        <form action="Arithmetic">
    <label> First: </label>
<input type=text name="no1"/><br/>
<label> Second: </label>
<input type="text" name="no2"/><br/>
<input type=submit name="arithmetic" value=+ />
<input type=submit name="arithmetic" value=- />
<input type=submit name="arithmetic" value=* />
<input type=submit name="arithmetic" value=% /> <br/>


<br/>
      
<p> Result ---${Result}${message}
       <br/>
</form>
         <a href=Agecalculator.jsp>Age Calculator</a>
    </body>
</html>
