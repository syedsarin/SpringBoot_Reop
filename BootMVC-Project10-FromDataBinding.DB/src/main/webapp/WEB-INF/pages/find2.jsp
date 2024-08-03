<%@ page language="java" isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
    }
    tr:nth-child(even) {
        background-color: #f9f9f9;
    }
    tr:hover {
        background-color: #f1f1f1;
    }
    h1 {
        color: red;
        text-align: center;
    }
</style>
</head>
<body>
<frm:form modelAttribute="employee">

     <table>
        <tr>
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Employee Department</th>
            <th>Employee Company</th>
            <th>Salary</th>
             
        </tr>
       
        <tr>
            <td>${employee.employeeId}</td>
            <td>${employee.employeeName}</td>
            <td>${employee.employeeDepartment}</td>
            <td>${employee.companyName}</td>
            <td>${employee.employeeSalary}</td>
         
        </tr>
        
    </table>

<input type="submit" value="Delete">
</frm:form>

</body>
</html>
