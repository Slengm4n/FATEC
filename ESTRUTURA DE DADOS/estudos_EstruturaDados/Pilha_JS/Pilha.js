pilha_roupa = [];

pilha_roupa = ["Toalha", "Camiseta", "Moletom", "calca"];

//Adiciona roupas a pilha
pilha_roupa.push("Jaqueta");
pilha_roupa.push("Cueca");
pilha_roupa.push("Roupao");

//Remove o ultimo elemento
let removido = pilha_roupa.pop();

//Lista todos os elementos atuais
console.log(pilha_roupa);

//lista o elemento removido da pilha
console.log("Roupa removida:", removido);

//Mostra a ultima peça no topo da pilha (-1 por conta do indicie)
let topo = pilha_roupa[pilha_roupa.length - 1];
console.log("Peça no topo da pilha: ", topo);

//Verifica se a pilha esta vazia
let isEmpty = pilha_roupa.length == 0;
console.log(isEmpty);

let tamanho = pilha_roupa.length;
console.log(tamanho);

for (let i = pilha_roupa.length - 1; i >= 0; i--) {
  console.log("Todas as peças de roupa da pilha: ", pilha_roupa[i]);
}
