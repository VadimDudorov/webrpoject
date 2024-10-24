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
    <h2>Знакомство с экипажем</h2>
    <p>
        Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной папкой в руках:<br>
        - Здравствуйте, командир! Я Неси - ваша помощница. Видите? Там в углу пьет кофе<br>
        наш штурман - сержант Гордон, под штурвалом спит наш бортмеханик - Льюис,<br>
        а фотографирует его Джонс - наш навигатор.<br>
        А как к вам обращаться?
    </p>
    <form>
        <input type="text" id="nameInput" class="styled-input" placeholder="Введите ваше имя">
    </form>
    <div class="button-container">
        <input type="button" class="font-button" value="Далее" onclick="submitName()">
    </div>
</div>

<script>
    function submitName() {
        const name = document.getElementById('nameInput').value;
        window.location = `/WebProject/spaceCraft?params=crew&name=${name}`;
    }
</script>

</body>
</html>