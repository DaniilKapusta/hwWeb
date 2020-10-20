flag = true;
function giveData(table) {
if (flag) {
table.innerHTML = "";
flag = false;
document.getElementById("showTable").innerText = "Показать таблицу";
} else {
table.innerHTML = "";
var ass = {};
var request = new XMLHttpRequest();
request.open('GET', "/GiveData");
request.responseType = 'text';
request.send();
request.onload = function() {
var obj = request.response;
ass = JSON.parse(obj);
///
var tr = document.createElement('tr');
var td = document.createElement('td');
td.innerHTML="ФИО";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Пол";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Адрес";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Дата рождения";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="О себе";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Имя отца";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Дата рождения отца";
tr.appendChild(td);

var td = document.createElement('td');
td.innerHTML="Место работы отца";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Имя матери";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Дата рождения матери";
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML="Место работы матери";
tr.appendChild(td);
table.appendChild(tr);
///

ass.forEach(s=>  {
var tr = document.createElement('tr');
var td = document.createElement('td');
td.innerHTML=s.name;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.sex;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.addrs;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.birthDate;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.aboutMe;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.fatherName;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.fatherBirthDate;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.fatherWork;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.motherName;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.motherBirthDate;
tr.appendChild(td);
var td = document.createElement('td');
td.innerHTML=s.motherWork;
tr.appendChild(td);
table.appendChild(tr);
});
}
document.getElementById("showTable").innerText= "Скрыть таблицу";
flag = true;
}
}