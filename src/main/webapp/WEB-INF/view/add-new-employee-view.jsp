<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Add new Employee</h2>
<form:form action="seveEmployee" modelAttribute="employee">
    Name:<form:input path="name"/>
    <br>
    Surname:<form:input path="surname"/>
    <br>
    Department:<form:input path="department"/>
    <br>
    Salary:<form:input path="salary"/>
    <br>
    <input type="submit" value="Ok">
</form:form>

</body>
</html>