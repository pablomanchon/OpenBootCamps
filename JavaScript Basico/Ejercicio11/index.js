class Estudiante {
  #nombre = "Pablo";
  #asignaturas = ["JavaScript", "HTML", "CSS"];

  getDatos() {
    return {
      nombre: this.#nombre,
      asignaturas: this.#asignaturas,
    };
  }
}
const estudiante = new Estudiante();

console.log(estudiante.getDatos());
