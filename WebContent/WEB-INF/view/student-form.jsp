<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>

<body>

<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName"/>

<br><br>

Last NAme: <form:input path="lastName"/>

<br><br>

Country:
<form:select path="country">
	
	<form:option value="India" lable="INDIA"></form:option>
	<form:option value="USA" lable="USA"></form:option>
	<form:option value="Norway" lable="Norway"></form:option>
	<form:option value="Canada" lable="CANADA"></form:option>

</form:select>

<br><br>

Favorite language:

JAVA <form:radiobutton path="favLang" value="java"/>
PYTHON <form:radiobutton path="favLang" value="py"/>

<br><br>

OS:
Linux <form:checkbox path="os" value="linux"/>
Window <form:checkbox path="os" value="window"/>
<input type = "submit" value="Submit">

</form:form>

</body>

</html>