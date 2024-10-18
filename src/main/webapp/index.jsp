<!DOCTYPE html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Выпадающее меню</title>
    <link rel="stylesheet" href="static/styles.css">
</head>
<body>
    <nav>
        <ul class="menu">
            <li><a href="#">Главная</a></li>
            <li class="dropdown">
                <a href="#" class="dropbtn">Квесты</a>
                <ul class="dropdown-content">
                    <li><a href="spaceCraft?params=start">Космический корабль</a></li>
                    <li><a href="#">Квест 2</a></li>
                    <li><a href="#">Квест 3</a></li>
                </ul>
            </li>
            <li><a href="#">Авторизоваться</a></li>
            <li><a href="#">Контакты</a></li>
        </ul>
    </nav>
</body>
</html>