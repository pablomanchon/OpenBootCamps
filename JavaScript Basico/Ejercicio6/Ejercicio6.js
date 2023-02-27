const listaCompras = ["Arroz", "Fideos", "Papas", "Queso", "Salame"];
listaCompras.push("Aceite de Girasol");

console.log(listaCompras);

peli1 = {
  titulo: "Planeta Verde",
  director: "Coline Serreau",
  fecha: "18 Sep 1996",
};
peli2 = {
  titulo: "El Hobbit",
  director: "Peter Jackson",
  fecha: "13 dec 2012",
};
peli3 = {
  titulo: "Shrek",
  director: "Vicky Jenson",
  fecha: "19 Jul 2001",
};

const listaPeliculas = [peli1, peli2, peli3];

const listaPelis2010 = listaPeliculas.filter(
  (p) => new Date(p.fecha).getTime() > new Date("1 jan 2010").getTime()
);

const directoresPeliculas = listaPeliculas.map((p) => p.director);

const titulosPeliculas = listaPeliculas.map((p) => p.titulo);

const titulosConDirector = directoresPeliculas.concat(titulosPeliculas);

const propagacionLista = [...titulosPeliculas, ...directoresPeliculas];
