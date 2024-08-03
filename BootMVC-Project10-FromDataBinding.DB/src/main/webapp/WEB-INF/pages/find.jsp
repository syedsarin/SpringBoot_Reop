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
    
    input {
    	
		color: green;
		text-align: center;
}
</style>
</head>
<body>
<frm:form action="updat" method="POST" modelAttribute="employee">

     <table>
        <tr>
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Employee Department</th>
            <th>Employee Company</th>
            <th>Salary</th>
             
        </tr>
       
        <tr>
            <td><frm:input path="employeeId" readonly="true"/></td>
            <td><frm:input path="employeeName"/></td>
            <td><frm:input path="employeeDepartment"/></td>
            <td><frm:input path="companyName"/></td>
            <td><frm:input path="employeeSalary"/></td>
         
        </tr>
        
    </table>
	<br>
	<input type="submit" value="Update">
</frm:form>

</body>
</html>
