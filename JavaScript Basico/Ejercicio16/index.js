let nombre = "Pablo";
let apellido = "Manchon";
let persona = {
  nombre: nombre,
  apellido: apellido,
};
//localStorage.setItem("Persona", JSON.stringify(persona));
//sessionStorage.setItem("Persona", JSON.stringify(persona));
document.cookie =
  "Persona=Pepe;expires=" + new Date(2023, 5, 6, 16, 16).toUTCString();
