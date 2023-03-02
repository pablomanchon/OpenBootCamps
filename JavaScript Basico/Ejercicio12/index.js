let num = 8;
let aFibo = [1];
for (let i = 1; i <= num; i++) {
  if (aFibo.length < 2) {
    aFibo = [...aFibo, 1];
  } else {
    aFibo = [...aFibo, aFibo[i - 1] + aFibo[i - 2]];
  }
}
console.log(aFibo);
