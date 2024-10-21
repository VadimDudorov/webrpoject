<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Космическое приключение</title>
    <link rel="stylesheet" href="static/fon.css">
</head>
<body>
    <div class="container">
        <h2>NLO</h2>
        <p>
            Ты потерял память и находишься на неизвестном космическом корабле.<br>
            Перед тобой стоят неизвестные существа и предлагают принять вызов!<br>
            Как ты поступишь?<br>
        </p>
        <div class="button-container">
            <input type="button" class="font-button" value="Принять" onclick="window.location='/WebProject/spaceCraft?params=nlo'">
            <input type="button" class="font-button" value="Отклонить" onclick="window.location='/WebProject/spaceCraft?params=loss'">
        </div>
    </div>
</body>
</html>