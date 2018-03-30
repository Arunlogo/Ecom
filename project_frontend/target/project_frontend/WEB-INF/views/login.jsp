<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> <form action="<c:url value='/j_spring_security_check'></c:url>" method="post">
      Username:<input type="text" id="username" name="j_username" />
      Password:<input type="password" id="password" name="j_password" />
      <input type="submit" value="Login" disabled="disabled" id="login" style="color:red"/>
    </form>
    <style>
#username {
    color:black;
}
</style>
    <script type=text/javascript src='https://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js'></script>
    <script type="text/javascript">
$(document).ready(function() {
     $('#login').attr('disabled','disabled');
     $('#username').keyup(function() {
        if($(this).val() != '') {
           $('#login').removeAttr('disabled');
        }
        else {
        $('#login').attr('disabled','disabled');
        }
     });
     $(document).ready(function() {
         $('#username').click(function(){
             $(this).css({'color': '#black'});
         });
     }); });
 
 
</script>
</body>
</html>