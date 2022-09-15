<html>
<head>
<title>Welcome</title>
</head>
<body>
<h2>This is welcome jsp page</h2>

<%
//String name=(String)session.getAttribute("name");
 int age= (int)session.getAttribute("age");
 String name = (String)pageContext.getAttribute("name", pageContext.SESSION_SCOPE);
 String name1 = (String)pageContext.getAttribute("name", pageContext.REQUEST_SCOPE);
 String name2 = (String)pageContext.getAttribute("name", pageContext.APPLICATION_SCOPE);
 String name3 = (String)pageContext.getAttribute("name", pageContext.PAGE_SCOPE);
out.println("<br>");
out.println("Happy "+age+" birthday "+name);//here we have used out and session implicit objects
out.println("<br>");
out.println(name+" this is page context session scope");
out.println("<br>");
out.println(name1+" this is page context request scope");
out.println("<br>");
out.println(name2+" this is page context application scope");
out.println("<br>");
out.println(name3+" this is page context page scope");
out.println("<br>");
String message = config.getInitParameter("configmessage");
out.print("config message is "+message);
out.println("<br>");
String message1 = application.getInitParameter("applicationmessage");
out.print("application message is "+message1);
out.println("<br>");

%>
<a href="Bye.jsp">click here for surprise</a>
</body>
</html