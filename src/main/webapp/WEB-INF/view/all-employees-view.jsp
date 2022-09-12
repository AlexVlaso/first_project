<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Employees</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Salary</th>
        <th>Department</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">
    <c:url var="updateEmp" value="/updateEmployee">
        <c:param name="empId" value="${emp.id}"/>
    </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.salary}</td>
            <td>${emp.department}</td>
            <td>
                <input type="button" value="update" onclick="window.location.href='${updateEmp}'"/>
            </td>
        </tr>
    </c:forEach>

</table>

<br>
<input type="button" value="add" onclick="window.location.href='addNewEmployee'"/>

</body>
</html>
