
ClientName = str(input("Nome do cliente: "))
Order = str(input("Pedido: "))
Price = float(input("Preço: "))

while True:
    print (ClientName)
    print (Order)
    print (Price)

    chose = bool(input("Deseja registrar outro cliente? (S/N)"))
    if chose != "S":
        break
