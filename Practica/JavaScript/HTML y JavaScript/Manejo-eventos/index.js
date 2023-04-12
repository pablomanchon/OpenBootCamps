// const f = document.getElementById("formulario");
// console.log(f);

// f.addEventListener("submit", (evento) => {
// console.log(evento);
// evento.preventDefault();
// });

const h = document.getElementsByClassName("hEj");

h.addEventListener("CambioTexto", (evento) => {
  console.log(evento);
});

const p1 = document.getElementsByClassName("perro");
const p2 = document.getElementsByClassName("gato");

function cambiarTecto(nuevoTexto, color) {
  const evento = new CustomEvent("CambioTexto", {
    detail: {
      texto: nuevoTexto,
      color,
    },
  });
  h.dispatchEvent(evento);
}
