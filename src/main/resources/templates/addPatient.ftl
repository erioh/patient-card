<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Пациенты</title>
    <link rel="stylesheet" href="/css/addPatient.css">

</head>
<body>
<div class="main">
    <p>Блок данных пациента<br></p>
    <div class="alert" hidden>
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <strong>Данные пацианта сохранены</strong>
    </div>
    ФИО<br>
    <div class="flex-container flex-first-block">
        <input id="lastName" class="lastName" type="text" name="lastName" placeholder="Фамилия" required>
        <input id="firstName" class="firstName" type="text" name="firstName" placeholder="Имя" required>
        <input id="patronymic" class="patronymic" type="text" name="patronymic" placeholder="Отчество" required><br>
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
            <input id="dateOfBirth" type="date" name="dateOfBirth" required><br>
        </div>
        <div>
            Телефон:<br>
            <input class="phoneNumber" type="tel" name="phoneNumber" required>
        </div>
        <div>
            e-mail<br>
            <input id="email" type="email" name="email" required>
        </div>
        <div>
            Задолженость:<br>
            <input id="debt" type="number" name="debt">
        </div>
    </div>
    <p></p>
    <div class="flex-container flex-third-block">
        <div class="address">
            <div>
                <textarea id="address" name="address" rows="10" cols="50" placeholder="Адресс" required=""></textarea>
            </div>
            <div>
                <div class="checkBoxDiv"><div>Согласен на обработку персональных данных</div> <div><input type="checkbox" name="dataPrivatePolisy"></div></div>
                <div class="checkBoxDiv"><div>Согласен на мотивационную рассылку (смс или e-mail)</div> <div><input type="checkbox" name="smsEmail"></div></div>
            </div>

        </div>
        <div>
            <textarea rows="20" cols=60"></textarea>
        </div>

    </div>
    <button class="btn btn-default" onclick="submit()">Сохранить</button>
</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
        integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>
<script type="text/javascript" src="/js/submitForm.js">

</script>
</body>
</html>