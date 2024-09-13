
while True:
    CotacaoAtual = float(input("Digite a cotação do dólar atual: "))
    Cambio = float(input("Digite quantos reais você quer trocar por dólares: "))
    i = Cambio * CotacaoAtual
    print("Por", Cambio, "dólares, você irá precisar de:", "R$", i)

    escolha = input("Deseja realizar outra operação? (S/N) ").strip().upper()
    if escolha != "S":
        print("Obrigado por usar o programa!")
        break
