<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Feilong_login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 
  <body>
    <center>
  	<font face="New roma" size="5" color="#000" >Connection Interface</font>
  	<%  
    String flag = request.getParameter("errNo");  
    try{
         if(flag!=null)
            out.println("The username does not exist or the password is incorrect.");
    }catch(Exception e){
        e.printStackTrace();
    }
   %>
  	<form action = "loginCh.jsp" method="post">
      <table width="300" height = "180" border="5" bordercolor="#A0A0A0"> 
 		<tr>
 		  <th>Username(email)：</th>
 		  <td><input type="text" name="name"  value = "Input your username" maxlength = "20" onfocus = "if(this.value == 'Input your username') this.value =''"></td>
 	    </tr>
 	    <tr>
 		  <th>Password：</th>
 		  <td><input type="password" name="pwd" maxlength = "20"></td>
 	    </tr>
 	    <tr>
 	      <td colspan = "2" align = "center">
 		    <input type="submit" name="submit" value="       login         ">
 		    <input type="button" value="return"
 			  οnclick="window.location.href('/webText')">
 	      </td>
 	    </tr>
 	  </table>
 	</form>
  </center>
  </body>
</html>