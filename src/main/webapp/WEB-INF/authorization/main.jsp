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
            <li><a href="#">Контакты</a></li>
            <li><a href="/WebProject">Авторизация</a></li>
        </ul>
    </nav>
    <section class="main-content">
            <h1>Добро пожаловать на страницу квестов!</h1>
            <p class = "text-box">
            Квесты – это уникальная возможность погрузиться в увлекательные приключения,<br>
            Решать головоломки, испытать свою сообразительность и командные навыки.<br>
            В каждом квесте вас ждут различные задачи, связанные с логикой,<br>
            Вниманием к деталям и взаимодействием с окружающей средой.<br><br>

            Квесты могут быть разной тематики – от космических приключений<br>
            До исторических головоломок,<br от загадок в заброшенных замках<br>
            До современных шпионских миссий.<br>
            Каждый квест разработан таким образом, чтобы участники<br>
            Чувствовали себя частью захватывающей истории,<br>
            Где успех зависит от умения работать в команде<br>
            И принимать решения под давлением.<br><br>
            Это отличный способ провести время с друзьями, семьей или коллегами,<br>
            Получить массу эмоций и проверить свои способности!<br>
            </p>

            <div class="session-info">
                        <h2>Информация о пользователе</h2>
                        <p>Имя пользователя: <strong><%= session.getAttribute("login") %></strong></p>
                        <p>Идентификатор сессии: <strong><%= session.getId() %></strong></p>
                        <p>Время создания сессии: <strong><%= new java.util.Date(session.getCreationTime()) %></strong></p>
                        <p>Последнее время активности: <strong><%= new java.util.Date(session.getLastAccessedTime()) %></strong></p>
                    </div>
        </section>
</body>
</html>