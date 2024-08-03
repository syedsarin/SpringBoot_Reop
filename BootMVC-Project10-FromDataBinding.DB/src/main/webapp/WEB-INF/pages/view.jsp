<%@ page language="java" isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="frm" %>

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

<script type="text/javascript">

function confirmDelete(){

    var flag = confirm("Do you want to delete?");
    if(flag==true){
    	alert("Record Deleted");	
   	 return flag; // Returns true if OK is pressed, otherwise false
		}
    else{
    	flag=false;
    	alert("Cancled");
    	return flag;
    }
}

</script>
</head>
<body>
    <h3 style="text-align: center;"><a href="./">Home</a>  <a href="register" style="margin-left: 10px">Add Employee</a></h3>
    
<frm:choose>
<frm:when test="${!empty Select}">
    <table>
        <tr>
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Employee Department</th>
            <th>Employee Company</th>
            <th>Salary</th>
             <th>Edit</th>
             <th>Delete</th>
        </tr>
        <frm:forEach var="emp" items="${Select}">
        <tr>
            <td>${emp.employeeId}</td>
            <td>${emp.employeeName}</td>
            <td>${emp.employeeDepartment}</td>
            <td>${emp.companyName}</td>
            <td>${emp.employeeSalary}</td>
            <td><a href="edit?id=${emp.employeeId}">Edit</a></td>
            <td><a href="delete?id=${emp.employeeId}" onclick="return confirmDelete()">Delete</a></td>
        </tr>
        </frm:forEach>
    </table>
    
</frm:when>
<frm:otherwise>
    <h1>Actor Data Not Found</h1>
</frm:otherwise>
</frm:choose>

	<h1>${inserting}</h1>
</body>
</html>
