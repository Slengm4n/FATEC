def verificar_gado():
   
    bois = []
 
    n= int(input("Número de bois a ser contado: "))
 
    for i in range(n):
        print(f"\nBoi {i+1}:")
        numero = int(i+1)
        peso = float(input("Qual o peso do gado? (KG): "))
        bois.append({"Número": numero, "Peso": peso})
   
    boi_gordo = bois[0]
    boi_magro = bois[0]
 
    for boi in bois:
        if boi["Peso"] > boi_gordo["Peso"]:
            boi_gordo = boi
        if boi["Peso"] < boi_magro["Peso"]:
            boi_magro = boi
   
    print("\nResultados: ")
    print(f"Boi mais gordo: Número {boi_gordo['Número']}, Peso {boi_gordo['Peso']}KG")
    print(f"Boi mais magro: Número {boi_magro['Número']}, Peso {boi_magro['Peso']}KG")
 
 
verificar_gado()