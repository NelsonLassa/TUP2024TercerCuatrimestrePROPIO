// While

let contador = 0;
while (contador < 3) {
  console.log(contador);
  contador++;
}
console.log("Fin del ciclo while");

// Do While

let conteo = 0;
do {
  console.log(conteo);
  conteo++;
} while (conteo < 3);
console.log("Fin del ciclo do while");

// For
for (let contando = 0; contando < 3; contando++) {
  console.log(contando);
  contando++;
}
console.log("Fin del ciclo for");

// Palabra reservada break
for (let contando = 0; contando <= 10; contando++) {
  if (contando % 2 == 0) {
    console.log(contando); // Muestra todos los pares
    break; // rompe y sale
  }
}
console.log("Termina el ciclo al encontrar el primer numero par");

// La palabra continue y Etiquetas Lebels
inicio:
for (let contando = 0; contando <= 10; contando++) {
  if (contando % 2 !== 0) {
    break inicio; // ir a la siguiente iteracion queda en un lebel
  }
  console.log(contando);
}
contando.log("Termina el ciclo");
 