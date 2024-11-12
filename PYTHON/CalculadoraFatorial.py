#Cálculo inicial
N = int(input("Digite o número que quer fazer a operação fatorial: "))
i=1

while (N>0):
    i = i * N
    N = N - 1
    
    print (i)


#Função Fatoral
def calcFatorialR(n):
    if n == 1:
        return 1
    else:
        r = n * calcFatorialR(n-1)
        return r