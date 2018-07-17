<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Пациенты</title>
<#--<link href="/css/main.css" rel="stylesheet">-->
</head>
<body>
<h2>Пациенты</h2>
<h1>${request}</h1>
<span>id</span><span>Имя</span><span>Фамилия</span>
<#list patientList as patient>
    <span>${patient.id}</span>
    <span>${patient.firstName}</span>
    <span>${patient.lastName}</span>
</#list>
</body>
</html>