let htmlNota1 = document.getElementById("html-nota1");
let htmlNota2 = document.getElementById("html-nota2");
let htmlNota3 = document.getElementById("html-nota3");
let htmlPromedio = document.getElementById("html-promedio");

let cssNota1 = document.getElementById("css-nota1");
let cssNota2 = document.getElementById("css-nota2");
let cssNota3 = document.getElementById("css-nota3");
let cssPromedio = document.getElementById("css-promedio");

let jsNota1 = document.getElementById("js-nota1");
let jsNota2 = document.getElementById("js-nota2");
let jsNota3 = document.getElementById("js-nota3");
let jsPromedio = document.getElementById("js-promedio");

htmlNota1.innerHTML = prompt("Ingrese la Nota 1 [HTML]: ");
htmlNota2.innerHTML = prompt("Ingrese la Nota 2 [HTML]: ");
htmlNota3.innerHTML = prompt("Ingrese la Nota 3 [HTML]: ");
htmlPromedio.innerHTML = (parseInt(htmlNota1.innerHTML) + parseInt(htmlNota2.innerHTML) + parseInt(htmlNota3.innerHTML)) / 3

cssNota1.innerHTML = prompt("Ingrese la Nota 1 [CSS]: ");
cssNota2.innerHTML = prompt("Ingrese la Nota 2 [CSS]: ");
cssNota3.innerHTML = prompt("Ingrese la Nota 3 [CSS]: ");
cssPromedio.innerHTML = (parseInt(cssNota1.innerHTML) + parseInt(cssNota2.innerHTML) + parseInt(cssNota3.innerHTML)) / 3

jsNota1.innerHTML = prompt("Ingrese la Nota 1 [JS]: ");
jsNota2.innerHTML = prompt("Ingrese la Nota 2 [JS]: ");
jsNota3.innerHTML = prompt("Ingrese la Nota 3 [JS]: ");
jsPromedio.innerHTML = (parseInt(jsNota1.innerHTML) + parseInt(jsNota2.innerHTML) + parseInt(jsNota3.innerHTML)) / 3