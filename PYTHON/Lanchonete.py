
ClientName = str(input("Nome do cliente: "))


while True:
    Order = str(input("Pedido: 01- Hot Dog | 02- Hamburger | 03- Cheeseburger | 04- Refrigerante lata | 05- Batatas fritas | 06- Misto quente: "))

    

    chose = bool(input("Deseja registrar outro cliente? (S/N)"))
    if chose != "S":
        break
