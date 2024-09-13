
switchOP = int(input("Digite o deseja realizar: 1: Média individual do aluno | 2: Média da turma: "))

match switchOP:
    case 1:
        while True:
            NomeAluno = str(input("Digite o nome do aluno: "))
            N1 = int(input("Insira a nota um: "))
            N2 = int(input("Insira a nota dois: "))
            N3 = int(input("Insita a nota três: "))
            N4 = int(input("Insira a nota quatro: "))

            media = (N1 + N2 + N3 + N4) / 4

            if media >= 6:
                print("-> Aluno: ", NomeAluno, "\n" "-> Tirou: ", media, "\n" "-> Status: Aprovado." )
            else:
                print("-> Aluno: ", NomeAluno, "\n" "-> Tirou: ", media, "\n" "-> Status: Reprovado." )
            
            escolha = str(input("Deseja realizar média de outro aluno: (S/N): "))
            if escolha != "S":
                break
            
    case 2:
        
        N = int(input("Informe a quantidade de médias que deseja caclular: "))
        total = 0
        resp = 's'
        i = 1
        while (resp.lower() == "s"):
            P1 = float(input("Informe a primeira nota: "))
            P2 = float(input("Informe a segunda nota: "))
            
            M = (P1 + P2) / 2
            total  = total + M
            print ("A média é igual a: ", M)
            if (M >= 6):
                print("\nAprovado!")
            elif (M < 3):
                print("\nExame")
            else:
                print("\nReprovado")
            i = i + 1
            
            resp = input("Deseja continuar? (S/N)")
            MT = total / i
            print (f"A média total é: {MT:.2f}")