const boton = document.querySelector("#btn");
boton.addEventListener("click", () => {
  alert("Hiciste click");
  confirm("¿Seguro?") ? alert("bienvenido") : alert("adios!");
});
