<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ошибка авторизации</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .error-container {
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 300px;
        }

        h2 {
            color: #ff0000; /* Красный цвет для акцента ошибки */
            margin-bottom: 20px;
        }

        p {
            margin-bottom: 20px;
            color: #333;
        }

        .back-btn {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            text-decoration: none;
        }

        .back-btn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="error-container">
    <h2>Неверный пароль</h2>
    <p>Вы ввели неправильный пароль. Пожалуйста, попробуйте снова.</p>
    <a href="/WebProject" class="back-btn">Вернуться к авторизации</a>
</div>

</body>
</html>