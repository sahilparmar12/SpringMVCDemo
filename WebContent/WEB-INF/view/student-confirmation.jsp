<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>

<body>

The Student is confirmed ${student.firstName} ${student.lastName} from ${student.country}
<br><br>

Yor favourate language is = ${student.favLang}
<br><br>

OS used: 

<ul>
<c:forEach var ="temp" items="${student.os }">
	<li> ${temp} </li>
</c:forEach>
</ul>

</body>

</html>