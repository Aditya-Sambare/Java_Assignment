<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome page</title>
</head>
<style>
    body{
    text-align : center;
    }
</style>
<body>
<h1>Insert Student</h1>
<form action="InsertStudentServlet">
    <input type="number" name="StudentId" placeholder="Student id"><br>
    <input type="text" name="StudentName" placeholder="student name"><br>
    <input type="text" name="SubjectName1" placeholder="subject name"><br>
    <input type="number" name="marks1" placeholder="marks"><br>
    <input type="text" name="SubjectName2" placeholder="subject name"><br>
    <input type="number" name="marks2" placeholder="marks"><br>
    <input type="submit">
</form>
</body>
</html>