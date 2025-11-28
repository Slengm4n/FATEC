var Nomes = new Array("Joao", "Ferando", "Rafael", "Kaue");

//PUSH-Adiciona dados ao array
Nomes.push("Paulo Bundao");
Nomes.push(5);

//UNSHIFT-Coloca o dado no inicio do array
Nomes.unshift("Kaue Legalzinho");

//POP-Remove um dado do final do vetor, no caso o (5)
Nomes.pop(Nomes);

//SHIFT-Remove o primeiro elemento do array
Nomes.shift(Nomes);

console.log(Nomes);

//CONCAT-Junta dois arrays
let marcas = ["Renault", "Chevrolet", "Hyundai", "Toyota"];
let modelos = ["Kwid", "Onix", "Creta", "Etios"];

let carros = marcas.concat(modelos);
console.log(carros);

//SLICE - Define o intervalo dos dados encima do das posições do vetor
let frutas = ["Maçã", "Banana", "Morango", "Abacaxi"];
let frutas_sel = frutas.slice(2, 4);
console.log(frutas_sel);

//SPLICE - Remove e insero um dado no local
let Frutas = ["Maçã", "Banana", "Morango", "Abacaxi"];
let frustas_sel1 = Frutas.splice(1, 1, "Jaca");
console.log(frustas_sel1);

//INCLUDES - Faz um verificação se o dado existe no arrya, retornando true caso exista
let PC = ["Placa de video", "RAM", "SSD", "CPU", "FONTE"];
let HaveGPU = PC.includes("Placa de video");
console.log(HaveGPU);

//MAP - Cria um array auxiliar para que retorne algum resultado esperado, como no caso o dobro dos numeros inciais
let nums = [1, 6, 7, 9, 3, 5, 2];
let result = nums.map((x) => x * 2);
console.log(result);

//FILTER - Cria um array auxiliar para que retorne os dados filtrados, no caso os numeros pares
let randomNums = [1, 2, 6, 7, 2, 3, 8, 10, 12, 18, 20, 26, 30, 38];
let parNumbers = randomNums.filter((x) => x % 2 == 0);
console.log(parNumbers);

//FIND - Percorre o array até achar o numero comparavel com o parametro para retornar a posição
let numerosFind = [1, 2, 3, 4, 5, 6];
let numeroFinded = numerosFind.find((x) => x > 2);
console.log(numeroFinded);

//FINDINDEX - Retorna o valor desejado senão retorna -1
let numerosIndex = [1, 2, 3, 4, 5, 6];
let indexNumeros = numerosIndex.findIndex((x) => x > 5);
console.log(indexNumeros);

//SOME - Função percorrea array todo e retorna true ou false se o valor for encontrado
let NUMS = [1, 2, 3, 4, 5, 6, 7];
let CountNUMS = NUMS.some((x) => x < 7);
console.log(CountNUMS);

//SORT - Ordena os dados de um array ordem crescente
let NumsUnsorted = [2, 5, 7, 8, 10, 11, 4, 5, 8, 12, 7, 5, 2, 10, 100, 1];
NumsUnsorted.sort();
console.log(NumsUnsorted);

//REVERSE - Ordena os dados de um array na ordem descrescente
let numsToReverse = [1, 10, 10, 100, 11, 12, 2, 2, 4, 5, 5, 5, 7, 7, 8, 8];
numsToReverse.reverse();
console.log(numsToReverse);
