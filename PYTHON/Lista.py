
num = []

for i in range (100):
    numero = int(input(f"Digite o {i+1}° valor: "))
    num.append(numero)

soma_mult_3 = sum(numero for numero in num if numero %3 ==0)

print("\nLista de números:", numero)
print("Soma dos múltiplos 3:", soma_mult_3)