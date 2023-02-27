let factorial = 1, contador = 1;
whileFactorial: while (true) {
    factorial *= contador++;
    if (contador === 11){
        break whileFactorial;
    }
}
console.log(factorial)