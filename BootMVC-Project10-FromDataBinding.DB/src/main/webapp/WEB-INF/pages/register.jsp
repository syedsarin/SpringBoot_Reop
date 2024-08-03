<%@ page language="java" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        overflow: hidden;
    }
    form {
        background: #fff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
        width: 320px;
        animation: fadeIn 1s ease-in-out, slideUp 1s ease-in-out;
    }
    @keyframes fadeIn {
        from {
            opacity: 0;
        }
        to {
            opacity: 1;
        }
    }
    @keyframes slideUp {
        from {
            transform: translateY(50px);
        }
        to {
            transform: translateY(0);
        }
    }
    dl {
        display: flex;
        flex-direction: column;
    }
    dt {
        font-weight: bold;
        margin-top: 15px;
        color: #333;
        position: relative;
        animation: slideIn 1s ease-in-out;
    }
    dd {
        margin: 5px 0 15px 0;
    }
    @keyframes slideIn {
        from {
            transform: translateX(-30px);
            opacity: 0;
        }
        to {
            transform: translateX(0);
            opacity: 1;
        }
    }
    input[type="text"] {
        width: calc(100% - 20px);
        padding: 10px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 4px;
        transition: border-color 0.3s ease;
    }
    input[type="text"]:focus {
        border-color: #4CAF50;
        outline: none;
        animation: pulse 1s infinite;
    }
    @keyframes pulse {
        0% {
            box-shadow: 0 0 0 0 rgba(76, 175, 80, 0.4);
        }
        70% {
            box-shadow: 0 0 0 10px rgba(76, 175, 80, 0);
        }
        100% {
            box-shadow: 0 0 0 0 rgba(76, 175, 80, 0);
        }
    }
    input[type="submit"] {
        width: calc(100% - 20px);
        padding: 10px;
        margin-top: 20px;
        border: none;
        border-radius: 4px;
        background-color: #4CAF50;
        color: white;
        cursor: pointer;
        transition: background-color 0.3s ease, transform 0.3s ease;
        animation: grow 1s ease-in-out;
    }
    @keyframes grow {
        from {
            transform: scale(0.9);
        }
        to {
            transform: scale(1);
        }
    }
    input[type="submit"]:hover {
        background-color: #45a049;
        transform: scale(1.05);
    }
    input[type="submit"]:active {
        background-color: #3e8e41;
        transform: scale(1);
    }
</style>
</head>
<body>
    <frm:form modelAttribute="employee">
        <dl>
            <dt>Enter Your Name</dt>
            <dd>
                <frm:input path="employeeName"/>
            </dd>    
            <dt>Employee Department</dt>
            <dd>
                <frm:input path="employeeDepartment"/>
            </dd>    
            <dt>Company Name</dt>
            <dd>
                <frm:input path="companyName"/>
            </dd>    
            <dt>Employee Salary</dt>
            <dd>
                <frm:input path="employeeSalary"/>
            </dd>    
        </dl>
        <input type="submit" value="submit"> 
    </frm:form>
</body>
</html>
