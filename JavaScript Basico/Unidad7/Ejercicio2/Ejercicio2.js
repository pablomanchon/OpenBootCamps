const yo = [
  {
    nombre: "Pablo",
    apellido: "Manchon",
    edad: 25,
    altura: 1.72,
    eresDesarrollador: true,
  },
];

const edad = yo[0].edad;
console.log(edad);

const amigos = [
  ...yo,
  {
    nombre: "Santiago",
    apellido: "De Santo",
    edad: 24,
    altura: 1.7,
    eresDesarrollador: true,
  },
  {
    nombre: "Tomas",
    apellido: "Espinoza",
    edad: 28,
    altura: 1.74,
    eresDesarrollador: false,
  },
];

const listaOrdenada = amigos.sort((a, b) => a.edad - b.edad);
console.log(listaOrdenada);
