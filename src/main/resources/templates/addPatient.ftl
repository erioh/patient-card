<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Пациенты</title>
    <link rel="stylesheet" href="/css/addPatient.css">
</head>
<body>
<form method="post" action="/patient/add">
    <div class="main">
        <p>Блок данных пациента<br></p>
        ФИО<br>
        <div class="flex-container flex-first-block">
            <input class="lastName" type="text" name="lastName" placeholder="Фамилия" required>
            <input class="firstName" type="text" name="firstName" placeholder="Имя" required>
            <input class="patronimic" type="text" name="patronimic" placeholder="Отчество" required><br>
        </div>
        <p>
        <div class="flex-container flex-second-block">
            <div>
                Пол:<br>
                М
                <input type="radio" name="sex" value=1 checked>
                Ж
                <input type="radio" name="sex" value=0>
            </div>
            <div>
                Дата рождения<br>
                <input type="date" name="dateOfBirth" required><br>
            </div>
            <div>
                Телефон:<br>
                <input type="tel" name="phoneSet[0]" required>
            </div>
            <div>
                e-mail<br>
                <input type="email" name="email" required>
            </div>
            <div>
                Задолженость:<br>
                <input type="number" name="debt">
            </div>
        </div>
        <p></p>
        <div class="flex-container flex-third-block">
            <textarea name="addressText" rows="10" cols="50" placeholder="Адресс" required></textarea><br>
        </div>
        <input type="submit" value="Сохранить">
    </div>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
        integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>
</body>
</html>