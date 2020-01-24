<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'Feilong_register.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <script>
    
		function addCheck(){
			var username=document.getElementById("username").value;
			var name=document.getElementById("username1").value;
			var surname=document.getElementById("usersurname").value;
			var pseudonym=document.getElementById("userpseudonym").value;
			var phone=document.getElementById("userphone").value;
			var password=document.getElementById("password").value;
			var newword=document.getElementById("newword").value;
			if(username==""){
				alert("Email cannot be blank!");
				document.getElementById("username").focus();  
				return false;
                }

            int index=username.indexOf("@");
            if(index==-1){
				alert("Email format is illegal!");
				document.getElementById("username").focus();  
				return false;
                }

            int i=0;
		    char ss = name.toCharArray();
	        for(i;i<ss.length;i++){
						if(ss[i].upper()>='Z' || ss[i].upper()<='A'){
							alert("Name can only contain letters!");
							break;
						 document.getElementById("name").focus();
						 return false;	
				}}

	        int j=0;
		    char ss = surname.toCharArray();
	        for(j;j<ss.length;i++){
						if(ss[j].upper()>='Z' || ss[j].upper()<='A'){
							alert("Surname can only contain letters!");
							break;
						 document.getElementById("surname").focus();
						 return false;	
				}}

	        int k=0;
		    char ss = pseudonym.toCharArray();
	        for(k;k<ss.length;i++){
						if(ss[k].upper()>='Z' || ss[k].upper()<='A'){
							alert("Pseudonym can only contain letters!");
							break;
						 document.getElementById("pseudonym").focus();
						 return false;	
				}}

	        for(var i = 0; i < phone.value.length; i++)
	        {
	        var str = "0123456789";
	        if(str.indexOf(phone.value.charAt(i))==-1)
	        {
	        alert("Telephone number can only contain numbers!");
	        phone.value = '';
	        phone.focus();
	        return false;
	        }
			
			if(password==""){
				alert("Password cannot be blank!");
				 document.getElementById("password").focus();
				 return false;
				 }
			if(password != newword){
				alert("The passwords entered are different!");
				 document.getElementById("newword").focus();
				 return false;
				 }
		
		function validate(){
		    var flag = addCheck();
		    if(flag == false)
		        return false;
		    return true;
	    }
	</script>
  <body>
    <center>
	<font face="New roma" size="4" color="#000">Registration interface</font>
	<form action = "checkRegister.jsp" method = "post" onsubmit = "return validate()">
  	<table width="400" height = "180" border="5" bordercolor="#A0A0A0">
  	  <tr>
		<th>Email: </th>
		<td><input type="text" name="username" value="Input your email address" maxlength = "32" onfocus = "if(this.value == 'Input your email address') this.value =''"></td>
 	  </tr>
 	  <tr>
		<th>Name：</th>
		<td><input type="text" name="username1" value="Input your name" maxlength = "32" onfocus = "if(this.value == 'Input your name') this.value =''"></td>
 	  </tr>
 	  <tr>
		<th>Surname：</th>
		<td><input type="text" name="usersurname" value="Input your surname" maxlength = "32" onfocus = "if(this.value == 'Input your surname') this.value =''"></td>
 	  </tr>
 	  <tr>
		<th>Pseudonym：</th>
		<td><input type="text" name="userpseudonym" value="Input your pseudonym" maxlength = "32" onfocus = "if(this.value == 'Input your pseudonym') this.value =''"></td>
 	  </tr><tr>
		<th>Address：</th>
		<td><input type="text" name="useraddress" value="Input your address" maxlength = "32" onfocus = "if(this.value == 'Input your address') this.value =''"></td>
 	  </tr><tr>
		<th>Telephone：</th>
		<td><input type="text" name="userphone" value="Input your telephone number" maxlength = "32" onfocus = "if(this.value == 'Input your telephone number') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>Additional personal info：</th>
 		<td><input type="text" name="userinfo" value="Input a personal description" maxlength = "32" onfocus = "if(this.value == 'Input a personal description') this.value =''"></td>
 	  </tr>
 	 <tr>
 		<th>Password：</th>
 		<td><input type="text" name="password" value="Input a password" maxlength = "20" onfocus = "if(this.value == 'Input a password') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>Confirm password：</th>
 		<td><input type="text" name="newword" value="Input your password again" maxlength = "20" onfocus = "if(this.value == 'Input your password again') this.value =''"></td>
 	  </tr>
	  <tr>
 		<td colspan = "2" align = "center">
 		  <input type="submit" value="Register">    
 		  <input type="reset" value="Reset">
 		</td>
	  </tr>
	</table>
    </form>
    </center>
  </body>
</html>