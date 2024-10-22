
while True:
    EscholaOP = int(input("Qual operação deseja realizar? \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n "))

    match EscholaOP:
        case 1:
                n1 = int(input("Digite o primeiro número: "))
                n2 = int(input("Digite o segundo número: "))
                
                i = n1 + n2
                
                print("Resultado é: ", i)
                
                
        case 2:
                n1 = int(input("Digite o primeiro número: "))
                n2 = int(input("Digite o segundo número: "))
                
                i = n1 * n2
                
                print("Resultado é: ", i)
                
        case 3:
                n1 = int(input("Digite o primeiro número: "))
                n2 = int(input("Digite o segundo número: "))
                
                i = n1 - n2
                
                print("Resultado é: ", i)
                            
        case 4:
                n1 = float(input("Digite o primeiro número: "))
                n2 = float(input("Digite o segundo número: "))
                
                i = n1 / n2
                if n2 == 0:
                    print("Número dois precisa ser maior que 0")
                else:
                    print("Resultado é: ", i)

        case default:
            print("Operação inválida :(")
            escolha = str(input("Deseja realizar média de outro aluno: (S/N): "))
            if escolha != "S":
                    break