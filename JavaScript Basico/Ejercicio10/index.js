import * as cont from "./Modulos/Controller.js";
import chalk from "chalk";

const suma1 = cont.suma(5, 10);
const suma2 = cont.suma(10, 10);

const multiplicacion = cont.multiplica(suma1, suma2);

console.log(chalk.green(multiplicacion));
