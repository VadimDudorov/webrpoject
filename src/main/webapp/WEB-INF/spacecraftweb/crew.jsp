<!DOCTYPE html>
<html>
<head>
    <title>Космическое приключение</title>
</head>
<body>
    <h2>Знакомство с экипажем</h2>
    Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной папкой в руках:<br>
    - Здравствуйте, командир! Я Неси - ваша помощница. Видите? Там в углу пьет кофе<br>
    наш штурман - сержант Гордон, под штурвалом спит наш бортмеханик - Льюис,<br>
    а фотографирует его Джонс - наш навигатор.<br>
    А как к вам обращаться?<br><br>
    <form>
    <input type="text" id="nameInput" placeholder="Введите ваше имя"></input>
    </form>
    <input type="button" value="Далее" onclick="submitName()">

    <script>
            function submitName() {
                const name = document.getElementById('nameInput').value;
                window.location = `/WebProject/spaceCraft?params=crew&name=${name}`;
            }
    </script>

</body>
</html>
