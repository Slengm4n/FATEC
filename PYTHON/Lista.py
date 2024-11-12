
valores = []

for i in range(100):
    N = int(input(f"Digite o valor {i + 1}: "))
    valores.append(N)

m_3 = sum(valor for valor in valores if valor % 3 == 0)

print("\nLista de valores lidos:", valores)
print("Somatório dos números múltiplos de 3:", m_3)
