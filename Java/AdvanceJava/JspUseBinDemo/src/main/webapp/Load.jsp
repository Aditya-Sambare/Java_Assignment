<%@page import="javaClasses.StudentPojo" %>
<html>
<body>
<h2>Enter details</h2>
<%
int rollno = Integer.parseInt(request.getParameter("rollno"));
String name = request.getParameter("name");
StudentPojo student = new StudentPojo();
student.setRollno(rollno);
student.setName(name);
out.println(student.getRollno());
out.println(student.getName());





%>
</body>
</html>