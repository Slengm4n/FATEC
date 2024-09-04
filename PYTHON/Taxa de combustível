
EscolhaOP = int(input("Digite qual cálculo deseja realizar: 1-Gasolina | 2-Etanol | 3-Diesel | 4-GNV: "))

match EscolhaOP:
    case 1:
        while True:
            KM = int(input("Digite os KM's rodados: "))
            L = int(input("Digite a quantidade de combustível utlizado: "))

            #Preço médio atual da gasolina no brasil
            GasolinaM = 6.13

            TX = KM / L 

            custo = TX * GasolinaM

            print (f"A taxa de consumo foi: {TX:.2f} km/L\nCom o custo de: R$ {custo:.2f}")
            if TX <= 8:
                print (f"O automóvel está consumindo muito combustível: {TX:.2f} km/L")
            else:
                print (f"O automóvel está com o consumo bom: {TX:.2f} km/L")

            opcao = str(input("Deseja realizar outro cálculo? (S/N): "))
            if opcao != "S":
                 break

    case 2:
        while True:
            KM = int(input("Digite os KM's rodados: "))
            L = int(input("Digite a quantidade de combustível utlizado: "))

            #Preço médio atual do etanol no brasil
            EtanolM = 4.08

            TX = KM / L 

            custo = TX * EtanolM

            print (f"A taxa de consumo foi: {TX:.2f} km/L\nCom o custo de: R$ {custo:.2f}")
            if TX <= 8:
                print (f"O automóvel está consumindo muito combustível: {TX:.2f} km/L")
            else:
                print (f"O automóvel está com o consumo bom: {TX:.2f} km/L")
            
            opcao = str(input("Deseja realizar outro cálculo? (S/N): "))
            if opcao != "S":
                 break
        
    case 3:
        while True:
            KM = int(input("Digite os KM's rodados: "))
            L = int(input("Digite a quantidade de combustível utlizado: "))

            #Preço médio atual da diesel no brasil
            DieselM = 5.95

            TX = KM / L 

            custo = TX * DieselM

            print (f"A taxa de consumo foi: {TX:.2f} km/L\nCom o custo de: R$ {custo:.2f}")
            if TX <= 8:
                print (f"O automóvel está consumindo muito combustível: {TX:.2f} km/L")
            else:
                print (f"O automóvel está com o consumo bom: {TX:.2f} km/L")

            opcao = str(input("Deseja realizar outro cálculo? (S/N): "))
            if opcao != "S":
                 break

    case 4:
        while True:
            KM = int(input("Digite os KM's rodados: "))
            L = int(input("Digite a quantidade de combustível utlizado: "))

            #Preço médio atual do GNV no brasil
            GnvM = 4.71

            TX = KM / L 

            custo = TX * GnvM

            print (f"A taxa de consumo foi: {TX:.2f} km/L\nCom o custo de: R$ {custo:.2f}")
            if TX <= 8:
                print (f"O automóvel está consumindo muito combustível: {TX:.2f} km/L")
            else:
                print (f"O automóvel está com o consumo bom: {TX:.2f} km/L")
        
            opcao = str(input("Deseja realizar outro cálculo? (S/N): "))
            if opcao != "S":
                    break
