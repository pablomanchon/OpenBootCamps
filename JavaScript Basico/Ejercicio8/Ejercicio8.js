function siempreTrue() {
  return true;
}

function asincronica() {
  console.log("Hola, soy una funcion asincronica");
}

// setTimeout(asincronica, 5000);

function* pares() {
  let par = 0;
  while (true) {
    par += 2;
    yield par;
  }
}

const par = pares();

console.log(par.next());
console.log(par.next());
console.log(par.next());
console.log(par.next());
