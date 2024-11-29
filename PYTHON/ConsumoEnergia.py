
dsp1 = "Lâmpada LED"
dsp2 = "TV LED"
dsp3 = "Ar condicioando"
dsp4 = "Geladeira"
dsp5 = "Computador"

def criarTabela():
    print("Nome do dispositivo\t\tkWh")
    print("----------------------------------------")
    print("%s:\t\t\t%f" % (dsp1, 00.1))
    print("%s:\t\t\t\t%f" % (dsp2, 0.1))
    print("%s:\t\t%f" % (dsp3, 1.5))
    print("%s:\t\t\t%f" % (dsp4, 0.3))
    print("%s:\t\t\t%f" % (dsp5, 0.2))
    print("----------------------------------------")
    
criarTabela()

def ConsumoEnergia():
     dsp = []
     
     N = int(input("O número de dispositivos a serem cálculados: "))

     for i in range(N):
         NomeDsp = str(input("Nome do dispositivo: "))
         Location = str(input("Cômodo onde o dispositivo fica localizado: "))
         Horas = int(input("Número de horas consumidas: "))
     
     dsp.append({"Dispositivo": NomeDsp, "Cômodo": Location, "Horas consumidas": Horas})
           
     
def criar_tabela():
    """Cria uma tabela com os dispositivos e seus consumos."""
    dispositivos = {
        "Lâmpada LED": 0.01,
        "TV LED": 0.1,
        "Ar condicionado": 1.5,
        "Geladeira": 0.3,
        "Computador": 0.2
    }
    print("Nome do dispositivo\t\tkWh")
    print("----------------------------------------")
    for dispositivo, consumo in dispositivos.items():
        print(f"{dispositivo}:\t\t{consumo:.2f}")
    print("----------------------------------------")

def calcular_consumo_total(dados):
    """Calcula o consumo total de energia para cada cômodo."""
    consumo_por_comodo = {}
    for dado in dados:
        dispositivo = dado["Dispositivo"]
        comodo = dado["Cômodo"]
        horas = dado["Horas consumidas"]
        consumo = dispositivos.get(dispositivo, 0) * horas
        consumo_por_comodo[comodo] = consumo_por_comodo.get(comodo, 0) + consumo
    return consumo_por_comodo

def main():
    criar_tabela()

    dados_dispositivos = []
    N = int(input("O número de dispositivos a serem calculados: "))

    for _ in range(N):
        nome_dsp = input("Nome do dispositivo: ")
        location = input("Cômodo onde o dispositivo fica localizado: ")
        horas = int(input("Número de horas consumidas: "))
        dados_dispositivos.append({"Dispositivo": nome_dsp, "Cômodo": location, "Horas consumidas": horas})

    consumo_total = calcular_consumo_total(dados_dispositivos)

    print("\nConsumo total por cômodo:")
    for comodo, consumo in consumo_total.items():
        print(f"{comodo}: {consumo:.2f} kWh")

if __name__ == "__main__":
    main()