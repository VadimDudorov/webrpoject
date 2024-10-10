<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <title>Космическое приключение</title>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
    <h2>Пролог</h2>
    Ты стоишь в космическом порту и готов подняться на борт <br>
    своего корабля. Разве ты не об этом мечтал? Стать капитаном<br>
    галактического судна с экипажем, который будет совершать<br>
    подвиги под твоим командованием.<br>
    Так что вперед!<br>
    <h2><input type="button" value="Далее" onclick="window.location='/WebProject/spaceCraft?params=team'"></h2>

    <h2>Знакомство с экипажем</h2>
</body>
</html>
