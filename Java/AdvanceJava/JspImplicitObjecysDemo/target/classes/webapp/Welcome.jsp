<%@ page errorPage="ErrorPage.jsp" %>

<html>
<head>
<title>Welcome</title>
</head>
<body>
<h2>This is welcome jsp page</h2>

<%
String name = request.getParameter("name"); //here we have used the request objects which is the implicit objects
String address = request.getParameter("address");
int age = Integer.parseInt(request.getParameter("age"));
out.println("name is "+name+" and age is "+age);//here we have used out object and it is also a implicit objects
session.setAttribute("name",name);
session.setAttribute("age",age);

pageContext.setAttribute("name",name, pageContext.SESSION_SCOPE);
pageContext.setAttribute("name",name, pageContext.REQUEST_SCOPE);
pageContext.setAttribute("name",name, pageContext.APPLICATION_SCOPE);
 pageContext.setAttribute("name",name, pageContext.PAGE_SCOPE);

if(age==0){
int a = 10/age;
}
%>
<a href="Greeting.jsp">click here to go on greeting page</a>
</body>
</html>